package com.itshaala;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CreateProcedureDemo {
    public static void main(String[] args) throws SQLException {
        String query = "create procedure sample_proc()\n" +
                "begin \n" +
                "    insert into expense(id, title,amount) values (301,'chai',200);\n" +
                "    insert into expense(id, title,amount) values (302,'coffee',400);\n" +
                "    insert into expense(id, title,amount) values (303,'samosa',999);\n" +
                "    insert into expense(id, title,amount) values (304,'kachori',9);\n" +
                "end;";
        Connection connection = ConnectionUtil.getConnection();
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();
        connection.close();
        System.out.println("stored procedure created");
    }
}
