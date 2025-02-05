package com.itshaala;


import java.sql.*;
import java.util.Scanner;

public class CreateProcedureUsingCallableStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // step 1. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        // step 2. Get connection from DriverManager
        String url = "jdbc:mysql://localhost:3306/isj006_advance";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //step 3. create callableStatement object
        String sql= "create procedure IF NOT EXISTS isj006_advance.student_procedure()\n" +
                "begin\n" +
                "    insert into student(id,name, address) values (1001,'Swpanil', 'Warje');\n" +
                "    insert into student(id,name, address) values (1002,'Onkar', 'Swargate');\n" +
                "    insert into student(id,name, address) values (1003,'Rohit', 'Kothrud');\n" +
                "    insert into student(id,name, address) values (1004,'Akshay', 'USA');\n" +
                "    insert into student(id,name, address) values (1005, 'Roshni', 'Dubai');\n" +
                "end;";
        CallableStatement callableStatement = connection.prepareCall(sql);

        //step 4. execute the calllable statement method
        callableStatement.execute();

        System.out.println("stored procedure created");

        connection.close();
    }
}
