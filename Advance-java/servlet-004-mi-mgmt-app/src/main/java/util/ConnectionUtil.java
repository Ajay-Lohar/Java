package util;


import lombok.*;

import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static constants.Mysql.*;


public class ConnectionUtil {
@Getter
    private static Connection connection;

static {
    try {
        Class.forName(DRIVER_NAME);
        connection =  DriverManager.getConnection(URL,USER_Name,PASSWORD);
    } catch (ClassNotFoundException | SQLException e) {
        System.out.println("Driver Not Found");;
    }
}
}
