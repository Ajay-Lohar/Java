package dao;
import model.Players;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    public List<Players> getAllPlayers() throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String sqlAll = "select * from mi";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Players> players = new ArrayList<>();
        preparedStatement = connection.prepareStatement(sqlAll);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Players player = new Players();
            player.setPid(resultSet.getInt("pid")) ;
            player.setPname(resultSet.getString("pname")) ;
            player.setPcountry(resultSet.getString("pcountry")) ;
            player.setProle(resultSet.getString("prole")) ;
            player.setPage(resultSet.getInt("page"));
            players.add(player);

        }
        return players;
    }


    public void deletePlayer(int PlayerId) {
        String query = "delete from mi where pid=?";
        Connection connection = ConnectionUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, PlayerId);
            preparedStatement.executeUpdate();
            System.out.println("Player deleted successfully");

        } catch (SQLException e) {
            System.out.println();
        }
    }

}


