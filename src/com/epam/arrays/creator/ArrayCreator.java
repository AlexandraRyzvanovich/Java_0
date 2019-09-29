package com.epam.arrays.creator;

import com.epam.arrays.exceptions.CreatorException;

import java.util.Random;

public class ArrayCreator {

    public int[] getArray(int size, int bound) {
        int[] array;
        try {
            Random random = new Random();
            array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(bound);
            }
        } catch (Exception e ) {
            throw new CreatorException("Invalid values to create array were given", e.getCause());
        }
        return array;
    }

    public int[] getIntStream(int min, int max, int maxCount) {
        int[] valuesIntStream;
        try {
            valuesIntStream = new Random().ints(min, max)
                    .limit(maxCount).distinct().toArray();
        } catch (Exception e) {
            throw new CreatorException("Invalid values to create array were given", e.getCause());
        }
        return valuesIntStream;
    }
}
