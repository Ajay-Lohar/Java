package com.itshaala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.itshaala.Constants.*;

public class CreateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /// 1. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. get the connection
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        //3. Create Statement object
        Statement statement = connection.createStatement();

        //4. execute the query
        String query = "create table course(id int primary key, name varchar(100))";
        boolean execute = statement.execute(query);//DDL

        System.out.println("table created "+execute);

        //5. close connection
        connection.close();
    }
}
