package Crud;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo7InserIntoTableFromUser {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);

        Statement statement = connection.createStatement();

        //get the data from user

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Teacher Name ");
        String name = scanner.next();

        System.out.println("Enter Teacher age ");
        String age = scanner.next();

        String sql = "insert into teacher(tname, tage) values('" + name + "'," + age + " )";
        statement.executeUpdate(sql);// DML query

        connection.close();

        System.out.println("Record insert successfully");

    }
}
