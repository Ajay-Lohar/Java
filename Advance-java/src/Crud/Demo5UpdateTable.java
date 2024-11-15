package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo5UpdateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/college";
        String username ="root";
        String password ="root";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        String UpdateQuery = "update teacher set tname = 'Aishwarya' where id=2";  // tname is the column name

        statement.executeUpdate(UpdateQuery);//DML Query

        connection.close();

        System.out.println("Record Update successfully");



    }
}


