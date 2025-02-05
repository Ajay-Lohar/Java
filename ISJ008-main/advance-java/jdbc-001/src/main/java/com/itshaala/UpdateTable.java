package com.itshaala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.itshaala.Constants.*;

public class UpdateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /// 1. load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. get the connection
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        //3. Create Statement object
        Statement statement = connection.createStatement();

        //4. execute the DML query
        String query = "update course set name='Master in Advance Java' where id=2";
        int rowsImpacted = statement.executeUpdate(query);

        System.out.println(" course updated " + rowsImpacted);

        //5. close connection
        connection.close();
    }
}
