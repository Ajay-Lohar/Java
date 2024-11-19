package Crud;

import java.sql.*;

import static Crud.Constants.*;

public class Demo12UpdateSelect {
    public static void main(String[] args) {
        //step1 : load and register the Driver with driverManager
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //step 2 : get the connection from DriverManager
            connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);

            //step 3 : Statement to execute the dynamic query
            String updateQuery = "update Teacher set tname= 'Ashish ' where id=13";
            Statement statement = connection.createStatement();

            int recordsUpdated = statement.executeUpdate(updateQuery);
            System.out.println("Records updated by update query " + recordsUpdated);

            //execute select query
            String selectQuery = "select * from Teacher";
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {

                System.out.println(resultSet.getInt(1) + "\t" +
                                resultSet.getString(2) + "\t" +
                                resultSet.getInt(3)
                        );
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("issue while closing");
            }
        }
    }
}
