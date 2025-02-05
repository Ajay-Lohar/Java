package com.itshaala.util;

import lombok.Getter;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

    @Getter
    private static Connection connection;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("C:\\Work\\ISJ006\\advance-java\\student-mgmt-app-servlet\\src\\main\\resources\\application.properties"));
            String driverClassName = properties.getProperty("mysql-driver-class");
            String url = properties.getProperty("mysql-url");
            String username = properties.getProperty("mysql-user-name");
            String password = properties.getProperty("mysql-password");
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url, username, password);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
