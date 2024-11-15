package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4DeleteTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/college";
        String username ="root";
        String password ="root";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        String DeleteTableQ = "delete from teacher where id =1";// id check in database
        statement.executeUpdate(DeleteTableQ);// DML Query

        connection.close();
        System.out.println("Delete Id  successfully");





    }
}


