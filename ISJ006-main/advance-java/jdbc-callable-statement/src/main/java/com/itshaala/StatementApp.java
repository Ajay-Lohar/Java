package com.itshaala;


import java.sql.*;
import java.util.Scanner;

public class StatementApp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title");
        String title = scanner.nextLine();
        // step 1. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        // step 2. Get connection from DriverManager
        String url = "jdbc:mysql://localhost:3306/isj006_advance";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //step 3. create a statement object in order to execute the queries
        Statement statement = connection.createStatement();

        //step 4. execute the query using statement object
        ResultSet resultSet = statement.executeQuery("select * from expense where title like '%" + title + "%'");

        //title
        //amount
        //note
        //date
        //time
        //payment_mode
        //step 5. use the result set
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + "\t" +
                    resultSet.getString("title") + "\t" +
                    resultSet.getDouble("amount") + "\t" +
                    resultSet.getString("note") + "\t" +
                    resultSet.getDate("date") + "\t" +
                    resultSet.getTime("time") + "\t" +
                    resultSet.getString("payment_mode") + "\t"
            );
        }
        connection.close();
    }
}
