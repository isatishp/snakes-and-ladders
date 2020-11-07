package com.deserve.test.board;

public class GameBoard {

    int playerPosition = 0;

    int snakeStartPosition = 14;
    int snakeEndPosition = 7;

    public GameBoard() {
        System.out.println("Player Initial Position: " + playerPosition);
    }

    public boolean movePlayer(int roll) {
        playerPosition += roll;
        if(playerPosition >= 100) {
            playerPosition = 100;
            return true;
        } else if (playerPosition == snakeStartPosition) {
            playerPosition = snakeEndPosition;
        }
        System.out.println("Player Position: " + playerPosition);
        return false;
    }
}
