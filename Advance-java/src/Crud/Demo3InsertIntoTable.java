package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3InsertIntoTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/college";
        String username ="root";
        String password ="root";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        String insertQuery = "insert into teacher(tname, tage )values('Jayraj', 21)";

        statement.executeUpdate(insertQuery);// DML Query

        connection.close();
        System.out.println("insert Record successfully");




    }
}


