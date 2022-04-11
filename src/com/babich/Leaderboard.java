package com.babich;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class Leaderboard implements ILeaderboard {

    private List<Player> playerList = new ArrayList<>();

    public void getLeaderboard() {
        List<Player> sortedPlayerList = playerList
                .stream()
                .sorted(Comparator.comparing(Player::getPoints, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        System.out.println("Leaderboard\n******************************\n");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%s-th place - Player name: %s - Points: %s%n",
                    i + 1, sortedPlayerList.get(i).getName(), sortedPlayerList.get(i).getPoints());
        }

        System.out.println("\n******************************\n");
    }

    public void updateLeaderboard(Player player) {
        if (!playerList.contains(player)) {
            playerList.add(player);
        }
    }
}
