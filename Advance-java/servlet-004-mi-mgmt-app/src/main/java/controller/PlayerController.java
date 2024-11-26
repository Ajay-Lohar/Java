package controller;
import model.*;
import service.PlayerService;

import java.sql.SQLException;

public class PlayerController {
    PlayerService playerService = new PlayerService();
    public void addPlayer(Players player) throws SQLException {
        playerService.addPlayer(player);
    }
}
