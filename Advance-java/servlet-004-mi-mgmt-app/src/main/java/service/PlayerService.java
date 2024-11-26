package service;
import dao.PlayerDao;
import model.Players;

import java.sql.SQLException;

public class PlayerService {
    PlayerDao playerDao = new PlayerDao();
     public void addPlayer(Players players) throws SQLException {
     playerDao.addPlayer(players);

    }
}
