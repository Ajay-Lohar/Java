package com.itshaala.util;

import com.itshaala.constants.MysqlConstants;
import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.itshaala.constants.MysqlConstants.*;

public class ConnectionUtil {


    @Getter
    private static Connection connection;

    static {
        try {
            Class.forName(DRIVER_CLASS);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver class not found");
        } catch (SQLException e) {
            System.out.println("invalid credentials");
        }
    }
}
