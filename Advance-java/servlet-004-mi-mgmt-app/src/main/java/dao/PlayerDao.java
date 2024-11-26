package dao;
import model.Players;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlayerDao {
    public void addPlayer(Players players) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();

        String sql = "insert into MI(pid,pname,pcountry,prole,page) values(?,?,?,?,?)";
        PreparedStatement preparedStatement = null;

        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,players.getPid());
        preparedStatement.setString(2,players.getPname());
        preparedStatement.setString(3,players.getPcountry());
        preparedStatement.setString(4,players.getProle());
        preparedStatement.setInt(5,players.getPage());

        preparedStatement.executeUpdate();
        System.out.println("Player Add Successfully");
    }
}


