package com.deserve.test.dice;

import java.util.Random;

public class CrookedDice implements Dice{
    @Override
    public int roll() {
        return 2 + new Random().nextInt(7/2) * 2;
    }
}
