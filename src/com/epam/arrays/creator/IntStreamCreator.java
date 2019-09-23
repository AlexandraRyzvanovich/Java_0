package com.epam.arrays.creator;

import java.util.Random;

public class IntStreamCreator {
    final int MIN = 1;
    final int MAX = 100;
    final int MAX_COUNT = 20;

    public int[] getIntStream(){
        int[] valuesStream = new Random().ints(MIN, MAX).limit(MAX_COUNT).distinct().toArray();

        return valuesStream;
    }
}
