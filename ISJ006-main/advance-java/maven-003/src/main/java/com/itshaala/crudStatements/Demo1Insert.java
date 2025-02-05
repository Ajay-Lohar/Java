package com.itshaala.crudStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1Insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. get the connection from DriverManager
        String url = "jdbc:mysql://localhost:3306/isj006_advance";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //3. create the Statement object by using connection
        Statement statement = connection.createStatement();

        //4. execute the query
        String sql = "insert into isj006_advance.student(id, name, address) VALUES (8,'Swapnil', 'Kothrud')";
        int i = statement.executeUpdate(sql);
        System.out.println("Data inserted successfully");

        //5. close the connection
        connection.close();
    }
}
