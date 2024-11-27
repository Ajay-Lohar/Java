package service;
import dao.PlayerDao;
import model.Players;

import java.sql.SQLException;
import java.util.List;

public class PlayerService {
    PlayerDao playerDao = new PlayerDao();
     public void addPlayer(Players players) throws SQLException {
     playerDao.addPlayer(players);

    }
    public List<Players> getAllPlayers() throws SQLException {
     return playerDao.getAllPlayers();

    }
    public void deletePlayer(int PlayerId) {
        playerDao.deletePlayer(PlayerId);
    }
}
