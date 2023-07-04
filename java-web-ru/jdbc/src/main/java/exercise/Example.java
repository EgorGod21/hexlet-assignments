package exercise;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class Example {
    public static void main(String[] args) throws IOException, SQLException {
        FileInputStream fileInputStream=new FileInputStream("date.properties");

        Properties properties=new Properties();
        properties.load(fileInputStream);

        String host= properties.getProperty("dbHost");
        String login= properties.getProperty("dbLogin");
        String password= properties.getProperty("dbPassword");

        Connection connection= DriverManager.getConnection(host,login,password);
//        Statement statement= connection.createStatement();
//        String init=new BufferedReader(new FileReader("init.sql")).lines().collect(Collectors.joining());
//        statement.execute(init);
//
//        ResultSet resultSet=statement.executeQuery("SELECT * FROM articles Limit 3");
//        List<User> users=new ArrayList<>();
//        while (resultSet.next()){
//           User user=new User();
//           user.setId(resultSet.getLong(1));
//           user.setTitle(resultSet.getString(2));
//            user.setBody(resultSet.getString(3));
//            users.add(user);
//        }
//        users.forEach(System.out::println);

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int val=1;
        boolean flag =true;
        while (flag){
            try {
            val= Integer.parseInt(bufferedReader.readLine());
            flag =false;
        }
        catch (Exception e){
            System.out.println("Введите число");
        }
        }


        PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM articles where id=?");
        preparedStatement.setInt(1,val);
        ResultSet resultSet1=preparedStatement.executeQuery();

        while (resultSet1.next()){
            User user=new User();
            user.setId(resultSet1.getLong(1));
            user.setTitle(resultSet1.getString(2));
            user.setBody(resultSet1.getString(3));
            System.out.println("\n"+user);
        }
    }
}
