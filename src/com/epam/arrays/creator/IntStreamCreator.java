package com.epam.arrays.creator;

import java.util.Random;

public class IntStreamCreator {
    private final int MIN = 1;
    private final int MAX = 100;
    private final int MAX_COUNT = 20;

    public int[] getIntStream() {
        int[] valuesStream = new Random().ints(MIN, MAX)
                .limit(MAX_COUNT).distinct().toArray();

        return valuesStream;
    }
}
