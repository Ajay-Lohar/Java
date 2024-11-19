package Crud;

import java.sql.*;
import java.util.Scanner;

import static Crud.Constants.*;

public class Demo10UpdateRecordPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);


        //User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id");
        int id = scanner.nextInt();
        System.out.println("Enter the Name");
        String name = scanner.next();
        System.out.println("Enter the Teacher Age");
        int age = scanner.nextInt();

        String uquery = "update teacher set tname= ? ,tage =? where id =?";

        PreparedStatement preparedStatement = connection.prepareStatement(uquery);
        preparedStatement.setString(1,name);
        preparedStatement.setInt(2, age);
        preparedStatement.setInt(3, id);

        //step 4: execute teh query
        int recordesUpdated = preparedStatement.executeUpdate();
        System.out.println("records updated "+recordesUpdated);
        System.out.println("student record updated..");


        System.out.println("Can Teacher List You Have ? YES/NO");

        String ans = scanner.next();

        Statement statement = connection.createStatement();
        if (ans.contentEquals("YES")){
            String sqlQuery ="select * from teacher";

            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1) + "\t" +
                        resultSet.getString(2) + "\t" +
                        resultSet.getInt(3)
                );
            }
        }else{
            System.out.println("Thank you");
        }


        connection.close();
    }
}
