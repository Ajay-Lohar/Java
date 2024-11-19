package Crud;

import java.sql.*;
import java.util.Scanner;

public class Demo9FetchRecordsPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url ="jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id");
        int id = scanner.nextInt();

        String sqlQuery = "select * from teacher where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
           System.out.println(resultSet.getInt("id") + "\t" +
                    resultSet.getString("tname") + "\t" +
                    resultSet.getInt("tage")
            );
        }
        connection.close();

    }
}
