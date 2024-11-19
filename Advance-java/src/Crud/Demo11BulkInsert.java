package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static Crud.Constants.*;

public class Demo11BulkInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);

        String query1 = "insert into Teacher(tname, tage) values('Bhosle Sir',44)";
        String query2 = "insert into Teacher(tname, tage) values('Pandit',34)";
        String query3 = "insert into Teacher(tname, tage) values('Jadhav',51)";
        String query4 = "insert into Teacher(tname, tage) values('Bosle Mam',43)";
        String query5 = "insert into Teacher(tname, tage) values('Jagdale',41)";


        Statement statement = connection.createStatement();

        statement.addBatch(query1);
        statement.addBatch(query2);
        statement.addBatch(query3);
        statement.addBatch(query4);
        statement.addBatch(query5);

        int[] recordsUpdated = statement.executeBatch();

        for (int temp : recordsUpdated) {
            System.out.print(temp + "\t");
        }

        connection.close();
        System.out.println("bulk record updated..");
    }
}
