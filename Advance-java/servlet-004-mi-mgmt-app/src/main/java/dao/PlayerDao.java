package dao;
import model.Players;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlayerDao {
    public void addPlayer(Players players) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String sql = "insert into mi(pname,pcountry,prole,page) values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,players.getPname());
        preparedStatement.setString(2,players.getPcountry());
        preparedStatement.setString(3,players.getProle());
        preparedStatement.setInt(4,players.getPage());
        preparedStatement.executeUpdate();
        System.out.println("Player Add Successfully");
    }
}


