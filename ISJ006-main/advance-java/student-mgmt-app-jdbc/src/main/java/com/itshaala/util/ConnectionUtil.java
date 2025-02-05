package com.itshaala.util;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.itshaala.constants.MySqlConstants.*;


public class ConnectionUtil {

    @Getter
    private static Connection connection;



    static {
        try {
            Class.forName(MYSQL_DB_DRIVER_NAME);
            connection = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USERNAME, MYSQL_DB_PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("driver not found");
        } catch (SQLException e) {
            System.out.println("issue in getting the connection");
        }
    }
}
