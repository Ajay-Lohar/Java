package Crud;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import static Crud.Constants.*;

public class Demo14 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, SQLException {
        //step1 : load and register the Driver with driverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 2 : get the connection from DriverManager
        Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);


        //step 3 : get the meta data about database
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        System.out.println(((DatabaseMetaData) databaseMetaData).getMaxConnections());
        System.out.println(databaseMetaData.getDriverName());


        //step 5: close the conneciton
        connection.close();
    }
}
