package com.itshaala;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchQueries {
    public static void main(String[] args) throws SQLException {
        String query = "delete from expense";
        String query1 = "insert into expense(id, title, amount, notes) values(201,'chocolates',100, 'friends treat')";
        String query2 = "insert into expense(id, title, amount, notes) values(202,'panipuri',87, 'friends treat')";
        String query3 = "insert into expense(id, title, amount, notes) values(203,'samosa',334, 'friends treat')";
        String query4 = "insert into expense(id, title, amount, notes) values(204,'jalebi',46, 'friends treat')";
        String query5 = "insert into expense(id, title, amount, notes) values(205,'rabdi',89, 'friends treat')";
        Connection connection = ConnectionUtil.getConnection();
        Statement statement = connection.createStatement();

        statement.addBatch(query);
        statement.addBatch(query1);
        statement.addBatch(query2);
        statement.addBatch(query3);
        statement.addBatch(query4);
        statement.addBatch(query5);

        int[] executeBatch = statement.executeBatch();
        for (int temp:executeBatch){
            System.out.println("rows impacted "+temp);
        }

        connection.close();
    }
}
