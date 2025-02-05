package com.itshaala;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class DropProcedureDemo {
    public static void main(String[] args) throws SQLException {
        String query = "drop procedure sample_proc";
        Connection connection = ConnectionUtil.getConnection();
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();
        connection.close();
        System.out.println("stored procedure dropped");
    }
}
