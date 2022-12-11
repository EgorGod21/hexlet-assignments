package exercise.servlet;

import exercise.Data;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static exercise.Data.getCompanies;

public class CompaniesServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                throws IOException, ServletException {
    String comp=request.getParameter("search");
       List<String> list=Data.getCompanies();
        PrintWriter out= response.getWriter();
    if (comp==null){
        out.println(list);
    }
    else {
       List<String > list1=new ArrayList<>();
       for (String val:list){
           if(val.contains(comp)){
               list1.add(val);
           }
       }
       if (list1.isEmpty()){out.println("Companies not found");}
       else {out.println(list1);}
    }

    }
}
