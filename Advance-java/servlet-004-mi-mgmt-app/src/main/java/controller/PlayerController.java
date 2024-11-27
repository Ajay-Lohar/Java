package controller;
import model.*;
import service.PlayerService;

import java.sql.SQLException;
import java.util.List;

public class PlayerController {
    PlayerService playerService = new PlayerService();
    public void addPlayer(Players player) throws SQLException {
        playerService.addPlayer(player);
    }
    public List<Players> getAllPlayers() throws SQLException {
        return playerService.getAllPlayers();

    }
    public void deletePlayer(int PlayerId) {
        playerService.deletePlayer(PlayerId);
    }


}
