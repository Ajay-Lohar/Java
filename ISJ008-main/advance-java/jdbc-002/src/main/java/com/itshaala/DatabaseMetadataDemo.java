package com.itshaala;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class DatabaseMetadataDemo {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        DatabaseMetaData metaData = connection.getMetaData();
        System.out.println("driver version : " + metaData.getDriverMajorVersion());
        System.out.println("max row size : " + metaData.getMaxRowSize());
        System.out.println("username :  " + metaData.getUserName());
        System.out.println("Maximum column length : " + metaData.getMaxColumnNameLength());

        connection.close();
    }
}
