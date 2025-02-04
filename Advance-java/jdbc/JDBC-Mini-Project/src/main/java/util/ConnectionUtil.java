package util;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static constants.MySql.*;



public class ConnectionUtil {
    @Getter
    private static Connection connection;
    static {
        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            System.out.println("unable to load the driver");
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("unable to get connection");
        }
    }

}