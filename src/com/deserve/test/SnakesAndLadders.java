package com.deserve.test;

import java.util.Random;

public class SnakesAndLadders {

    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        boolean done = false;
        int turn = 0;

        while(!done) {
            int roll = new Random().nextInt(5) + 1;
            turn++;
            System.out.println("Player Rolled: " + roll);
            done = gameBoard.movePlayer(roll);
            if(done)
                System.out.println("Player won!");
            if(turn == 10) {
                break;
            }

        }
    }
}
