package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static constants.Mysql.*;

public class ConnectionUtil {
    private static Connection connection;


    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found Exeption"+ e.getMessage());
        }
    }

    public static Connection getConnection(){
        if(connection == null){
            try {
                connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            } catch (SQLException e) {
                System.out.println("sql Exception "+e.getMessage());
            }
        }
        return connection;
    }

}
