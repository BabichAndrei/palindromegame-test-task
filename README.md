# Palindrome Game
Данное приложение имеет следующие компоненты:
- Игрок (Player)
- Таблица результатов (Leaderboard)
- Игра Палиндорм (PalindromeGame)

Игрок хранит в себе имя игрока, его количество очков и использованные слова.
Таблица результатов хранит список игроков и имеет возможность выводить первых пять игроков.
Игра выполняет две функции: подсчёт количества очков конкретного палиндрома, с проверкой слова на уникальность у данного игрока, и начисление этих очков игроку.

Возможность игры через консоль не реализован. Сыграть в игру можно реализовав в классе Main следующий код
```
ILeaderboard leaderboard = new Leaderboard();
        PalindromeGame palindromeGame = new PalindromeGame(leaderboard);

        Player player = new Player("Andrey");
        Player player1 = new Player("Adam");
        Player player2 = new Player("Lena");

        palindromeGame.play(player, "радар");
        palindromeGame.play(player2, "моток с котом");
        palindromeGame.play(player1, "тут как тут");

        leaderboard.getLeaderboard();

```
