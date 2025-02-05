package com.itshaala.otherOperations;

import com.itshaala.util.ConnectionUtil;

import java.sql.*;

public class Demo3DatabaseMetaData {
    public static void main(String[] args) {
        // DatabaseMetaData : gets use information about the database
        Connection connection = ConnectionUtil.getConnection();
        try {
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            System.out.println("DB Major version : "+databaseMetaData.getDriverMajorVersion());
            System.out.println("DB Username : "+databaseMetaData.getUserName());
            System.out.println("DB Max row size : "+databaseMetaData.getMaxRowSize());
            System.out.println("DB Table types : "+databaseMetaData.getTableTypes());


        } catch (SQLException e) {
            System.out.println("issue in compiling the query");
        }
    }
}
