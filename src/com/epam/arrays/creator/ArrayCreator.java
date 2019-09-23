package com.epam.arrays.creator;

import java.util.Random;

public class ArrayCreator {
    final int BOUND = 20;
    final int SIZE = 10;

    public int[] getArray() {
        Random random = new Random();
        int[] array = new int[SIZE];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(BOUND);
        }
        return array;
    }
}
