package com.itshaala.otherOperations;

import com.itshaala.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
    public static void main(String[] args) {
        //bulk insert statements
        String query1 = "insert into isj006_advance.student(id, name, address, email, phone) values(21, 'Raju','Mumbai','raju@gmail.com',9090)";
        String query2 = "insert into isj006_advance.student(id, name, address, email, phone) values(22, 'Sham','Nashik','sham@gmail.com',9090)";
        String query3 = "insert into isj006_advance.student(id, name, address, email, phone) values(23, 'Kartik','Thane','kartik@gmail.com',9090)";
        String query4 = "insert into isj006_advance.student(id, name, address, email, phone) values(24, 'Nikhil','Nagpur','Nikhil@gmail.com',9090)";

        //get the connection
        Connection connection = ConnectionUtil.getConnection();

        //create the statement object
        try {
            Statement statement = connection.createStatement();
            statement.addBatch(query1);
            statement.addBatch(query2);
            statement.addBatch(query3);
            statement.addBatch(query4);
            statement.executeBatch();
            System.out.println("insert queries executed");
        } catch (SQLException e) {
            System.out.println("issue in sql query");
        }
    }
}
