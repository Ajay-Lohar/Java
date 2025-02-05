package com.itshaala;

import com.mysql.cj.jdbc.StatementImpl;

import java.sql.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //load driver in the memory & register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");


        //1. get the connection : url, username, password
        String url = "jdbc:mysql://localhost:3306/hr";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);

        //2. create statement object to execute query
        Statement statement = connection.createStatement();

        //3. use the result set
        ResultSet resultSet = statement.executeQuery("select * from employees limit 10");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("employee_id") + "\t" +
                    resultSet.getString("first_name") + "\t" +
                    resultSet.getString("last_name"));
        }

        //close the connection
        connection.close();


    }
}
