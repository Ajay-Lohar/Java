package Crud;

import java.sql.*;

public class Demo1CreateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        String query = "create table teacher(id int primary key auto_increment, tname varchar(50), tage int)";
        boolean isTableCreated = statement.execute(query); // DDL query --> execute satement

        connection.close();
        System.out.println("Table created successfully");

    }
}
