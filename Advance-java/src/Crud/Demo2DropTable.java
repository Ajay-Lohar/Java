package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2DropTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);

        Statement statement = connection.createStatement();
        String query  ="drop table teacher";

        boolean isTableDelete =  statement.execute(query);
        connection.close();
        System.out.println("Table drropped successfully");

    }
}
