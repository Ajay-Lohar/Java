package Crud;

import java.sql.*;
import java.util.Scanner;

public class Demo7InserIntoTableFromUserPrepareStatemetr {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);


        //get the data from user

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Teacher Name ");
        String name = scanner.next();

        System.out.println("Enter Teacher age ");
        int age = scanner.nextInt();

        String sql = "insert into teacher(tname, tage) values(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, age);
        preparedStatement.executeUpdate();
        connection.close();

        System.out.println("Record insert successfully");

    }
}
