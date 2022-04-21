package com.babich;

public class Main {

    public static void main(String[] args) {

        ILeaderboard leaderboard = new Leaderboard();
        PalindromeGame palindromeGame = new PalindromeGame(leaderboard);

        Player player = new Player("Andrey");
        Player player1 = new Player("Adam");
        Player player2 = new Player("Lena");

        palindromeGame.play(player, "aaa");
        palindromeGame.play(player2, "aaaaaa");
        palindromeGame.play(player1, "wwwww");

        leaderboard.getLeaderboard();
    }
}
