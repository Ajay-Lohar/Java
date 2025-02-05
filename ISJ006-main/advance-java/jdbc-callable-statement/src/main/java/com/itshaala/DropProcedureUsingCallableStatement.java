package com.itshaala;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DropProcedureUsingCallableStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // step 1. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        // step 2. Get connection from DriverManager
        String url = "jdbc:mysql://localhost:3306/isj006_advance";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //step 3. create callableStatement object
        String sql= "drop procedure student_procedure";
        CallableStatement callableStatement = connection.prepareCall(sql);

        //step 4. execute the calllable statement method
        callableStatement.execute();

        System.out.println("stored procedure dropped");

        connection.close();
    }
}
