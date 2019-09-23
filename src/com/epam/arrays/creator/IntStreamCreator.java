package com.epam.arrays.creator;

import java.util.Random;

public class IntStreamCreator {
    public int[] getIntStream(){
        int[] valuesStream = new Random().ints(10, 50).limit(10).distinct().toArray();

        return valuesStream;
    }
}
