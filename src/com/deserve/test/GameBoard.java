package com.deserve.test;

public class GameBoard {

    private final int ROWS = 10;
    private final int COLS = 10;

    private int[][] gameBoard = new int[ROWS][COLS];
    int playerPosition = 1;
    int tileStart = 1;

    public GameBoard() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                gameBoard[row][col] = tileStart++;
            }
        }
    }

    public boolean movePlayer(int roll) {
        playerPosition += roll;
        if(playerPosition >= 100) {
            playerPosition = 100;
            return true;
        }
        System.out.println("Player Position: " + playerPosition);
        return false;
    }
}
