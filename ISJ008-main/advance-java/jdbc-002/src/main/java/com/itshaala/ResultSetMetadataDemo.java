package com.itshaala;

import java.sql.*;

public class ResultSetMetadataDemo {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from expense");

        //metadata
        ResultSetMetaData metaData = resultSet.getMetaData();

        System.out.println("Column count : " + metaData.getColumnCount());
        System.out.println("Column name : " + metaData.getColumnLabel(2));
        System.out.println("Column type : " + metaData.getColumnType(2));

        connection.close();
    }
}
