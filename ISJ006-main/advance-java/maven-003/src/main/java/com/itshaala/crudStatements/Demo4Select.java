package com.itshaala.crudStatements;

import java.sql.*;

public class Demo4Select {
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
        String sql = "select * from isj006_advance.student";
        ResultSet resultSet = statement.executeQuery(sql);

        // read the ResultSetObject
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + "\t" +
                    resultSet.getString("name") + "\t" +
                    resultSet.getString("address"));
        }

        //5. close the connection
        connection.close();
    }
}
