package com.itshaala;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.itshaala.Constants.*;

public class ConnectionUtil {
    @Getter
    private static Connection connection;

    static {
        try {
            Class.forName(DRIVER_CLASS);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("invalid driver class name" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("invalid credentials " + e.getMessage());
        }

    }
}
