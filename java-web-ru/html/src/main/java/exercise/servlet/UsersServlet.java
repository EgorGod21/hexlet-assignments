package exercise.servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import exercise.User;
import org.apache.commons.lang3.ArrayUtils;

public class UsersServlet extends HttpServlet {
    private List<User> userList;
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                throws IOException, ServletException {

        String pathInfo = request.getPathInfo();
        try {
            getUsers();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        if (pathInfo == null) {
            showUsers(request, response);
            return;
        }

        String[] pathParts = pathInfo.split("/");
        String id = ArrayUtils.get(pathParts, 1, "");

        showUser(request, response, id);
    }

    private List getUsers() throws JsonProcessingException, IOException, URISyntaxException {
        StringBuilder stringBuilder=new StringBuilder();
        try (FileReader fileReader=new FileReader(new File(Thread.currentThread().getContextClassLoader().getResource("users.json").toURI()));
             BufferedReader bufferedReader=new BufferedReader(fileReader)) {
            while (bufferedReader.ready()){
                stringBuilder.append(bufferedReader.readLine());
            }
        }

        userList=new ObjectMapper().readValue(stringBuilder.toString(), new TypeReference<>() {});
        return userList;
    }

    private void showUsers(HttpServletRequest request,
                          HttpServletResponse response)
                throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out =response.getWriter();
        StringBuilder body = new StringBuilder();
        body.append("<table>\n" +
                "    <thead>\n" +
                "        <tr>\n" +
                "            <th>id</th>\n" +
                "            <th>fullName</th>\n" +
                              "        </tr>\n" +
                "    </thead>\n" +
                "    <tbody>\n"
               );
        for (User user: userList){
            body.append("<tr><td>\n").append(user.getId()).append("</td>\n");
            body.append("<td>\n").append("<a href=\"/users/"+user.getId()+"\">"+user.getFirstName()+" "+user.getLastName()+"</a>").append("</td></tr>\n");
        }
body.append(
        "    </tbody>\n" +
        "</table>");
        out.println(body.toString());

    }

    private void showUser(HttpServletRequest request,
                         HttpServletResponse response,
                         String id)
                 throws IOException {
      if (id.equals("")){
          response.sendError(404,"Not found");
      }
      else{
        User user=userList.stream()
              .filter(a->a.getId()==Integer.parseInt(id))
              .findFirst().orElse(null);
      if (user==null){
          response.sendError(404,"Not found");
      }
      else {
          response.setContentType("text/html;charset=UTF-8");
          PrintWriter out =response.getWriter();
          StringBuilder body = new StringBuilder();
          body.append("""
            <!DOCTYPE html>
            <html lang=\"ru\">
                <head>
                    <meta charset=\"UTF-8\">
                    <title>Example application | Users</title>
                    <link rel=\"stylesheet\" href=\"mysite.css\">
                </head>
                <body>
            """);
          body.append("<p>"+"firstName: " +user.getFirstName()+ "</p>");
          body.append("<p>"+"lastName: " +user.getLastName()+ "</p>");
          body.append("<p>"+"id: " +user.getId()+ "</p>");
          body.append("<p>"+"email: " +user.getEmail()+ "</p>");
          body.append("""
                </body>
            </html>
            """);
          out.println(body.toString());
      }
    }}

}

