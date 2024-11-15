package Crud;

import java.sql.*;

public class Demo6FetchRecords {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/college";
        String username ="root";
        String password ="root";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        String sqlQuery ="select * from teacher";

        ResultSet resultSet = statement.executeQuery(sqlQuery); // DDL Query


        System.out.println("id"+"\t"+"TName"+"\t"+"TAge");
        while (resultSet.next()){
//            System.out.println(
//                    resultSet.getInt("id")+"\t"+
//                    resultSet.getString("tname")+"\t"+
//                    resultSet.getString("tage")+"\t"
//            );

            System.out.println(resultSet.getInt(1) + "\t" +
                    resultSet.getString(2) + "\t" +
                    resultSet.getInt(3)
            );
        }


        connection.close();


    }
}
