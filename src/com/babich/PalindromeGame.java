package com.babich;

public class PalindromeGame {

    private final ILeaderboard leaderboard;

    public PalindromeGame(ILeaderboard leaderboard) {
        this.leaderboard = leaderboard;
    }

    public void play(Player player, String str) {
        int points;

        if (!player.getUsedPalindromes().contains(str)) {
            if ((points = getPointsFromPalindrome(str)) > 0) {
                player.setPoints(player.getPoints() + points);
                player.getUsedPalindromes().add(str);
                leaderboard.updateLeaderboard(player);
            }
        }
    }

    private int getPointsFromPalindrome(String str) {
        String[] chars = str.toLowerCase().split("");

        for (int i = 0; i < chars.length; i++) {
            if (!(chars[i].equals(chars[chars.length - i - 1]))) {
                return 0;
            }
        }

        return chars.length;
    }


}
