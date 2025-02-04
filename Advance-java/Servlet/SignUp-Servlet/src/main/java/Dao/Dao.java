package Dao;

import utill.ConnectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {
    public void addPlayer(Customer customer) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();

        String sql = "insert into signup(username,password,email,password) values(?,?,?,?)";
        PreparedStatement preparedStatement = null;

        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,customer.getusername());
        preparedStatement.setString(2,customer.gepa());
        preparedStatement.setString(3,customer.getPcountry());


        preparedStatement.executeUpdate();
        System.out.println("Player Add Successfully");
    }
}
