package com.itshaala;

import java.sql.*;
import java.util.Scanner;

public class InsertQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/ISJ006_advance";
        String dbUsername = "root";
        String dbPassword = "root";
        String sql = "insert into student(id, name, address) values (?,?,?)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        System.out.println("Enter id, name, address");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.next();
        String address = scanner.next();

        PreparedStatement prepareStatement = connection.prepareStatement(sql);
        prepareStatement.setInt(1, id);
        prepareStatement.setString(2, name);
        prepareStatement.setString(3, address);
        prepareStatement.executeUpdate();
        System.out.println("Record inserted successfully");

        connection.close();

    }
}
