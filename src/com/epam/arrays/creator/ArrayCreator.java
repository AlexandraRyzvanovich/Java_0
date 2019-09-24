package com.epam.arrays.creator;

import java.util.Random;

public class ArrayCreator {
    final private int BOUND = 20;
    final private int SIZE = 10;
    private final int MIN = 1;
    private final int MAX = 100;
    private final int MAX_COUNT = 20;

    public int[] getArray() {
        Random random = new Random();
        int[] array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(BOUND);
        }
        return array;
    }
    public int[] getIntStream() {
        int[] valuesIntStream = new Random().ints(MIN, MAX)
                .limit(MAX_COUNT).distinct().toArray();

        return valuesIntStream;
    }
}
