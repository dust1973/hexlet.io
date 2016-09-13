package io.hexlet.java.m101.xo.controller;

import io.hexlet.java.m101.xo.model.Figure;
import io.hexlet.java.m101.xo.model.Player;

/**
 * Created by FuchsA on 13.09.2016.
 */
public class GameController {

    private static final int MIN_COORDINATE = 0;

    private static final int MAX_COORDINATE = 2;

    private static final int PLAYERS_COUNT = 2;

    private final String gameName;

    private Player[] players = new Player[] {new Player("Max", new Figure("O")),
                                             new Player("Leo", new Figure("X"))};

    public String getGameName() {
        return gameName;
    }

    public GameController(final String gameName) {
        if(gameName == null || gameName.isEmpty()){
            this.gameName = "XO";
        }else {

            this.gameName = gameName;
        }
    }
}
