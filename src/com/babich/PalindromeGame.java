package com.babich;

public class PalindromeGame {

    private final ILeaderboard leaderboard;

    public PalindromeGame(ILeaderboard leaderboard) {
        this.leaderboard = leaderboard;
    }

    public void play(Player player, String str) {
        if (!player.getUsedPalindromes().contains(str)) {
            int points = getPointsFromPalindrome(str);

            if (points > 0) {
                player.setPoints(player.getPoints() + points);
                player.getUsedPalindromes().add(str);
                leaderboard.updateLeaderboard(player);
            }
        }
    }

    private int getPointsFromPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (!(str.charAt(i) == (str.charAt(str.length() - 1)))) {
                return 0;
            }
        }

        return str.length();
    }
}
