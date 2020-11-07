package com.deserve.test;

import com.deserve.test.board.GameBoard;
import com.deserve.test.dice.CrookedDice;
import com.deserve.test.dice.Dice;
import com.deserve.test.dice.NormalDice;

public class SnakesAndLadders {

    public static void main(String[] args) {
        System.out.println("Playing with Normal Dice");
        playWithDice(new NormalDice());
        System.out.println();
        System.out.println("Playing with Crooked Dice");
        playWithDice(new CrookedDice());
    }

    private static void playWithDice(Dice dice) {
        GameBoard gameBoard = new GameBoard();
        boolean done = false;
        int turn = 0;

        while (!done) {
            int roll = dice.roll();
            turn++;
            System.out.println("Player Rolled: " + roll);
            done = gameBoard.movePlayer(roll);
            if (done)
                System.out.println("Player won!");
            if (turn == 10) {
                break;
            }
        }
    }
}
