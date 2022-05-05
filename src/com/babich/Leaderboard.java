package com.babich;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Leaderboard implements ILeaderboard {

    private final List<Player> playerList = new ArrayList<>();

    public void getLeaderboard() {
        playerList
                .stream()
                .sorted(Comparator.comparing(Player::getPoints, Comparator.reverseOrder()))
                .limit(5)
                .forEach(player -> System.out.printf("Player name: %s - Points: %s%n",
                        player.getName(), player.getPoints())
                );
    }

    public void updateLeaderboard(Player player) {
        if (!playerList.contains(player)) {
            playerList.add(player);
        }
    }
}
