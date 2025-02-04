package utill;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static Constants.Mysql.*;

public class ConnectionUtil {

    @Getter
    private static Connection connection;

    static{
        try{
        Class.forName(DRIVERNAME);
         connection = DriverManager.getConnection(URL,USERNAME,PASSWORD)
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

