package com.deserve.test.dice;

import java.util.Random;

public interface Dice {
    default int roll(){
        return new Random().nextInt(6) + 1;
    }
}
