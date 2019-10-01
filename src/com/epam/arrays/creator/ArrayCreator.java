package com.epam.arrays.creator;

import com.epam.arrays.exceptions.CreatorException;

import java.util.Random;

public class ArrayCreator {

    public int[] getArray(int size, int valueRange) {

        if (size < 0) {
            throw new CreatorException("Invalid valueRange to create array were given");
        }
        int[] array;
            Random random = new Random();
            array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(valueRange);
            }
        return array;
    }

    public int[] getIntStream(int min, int max, int maxCount) {
        if (maxCount < 0) {
            throw new CreatorException("Invalid maxCount to create array were given");
        }
        int[] valuesIntStream;
            valuesIntStream = new Random().ints(min, max)
                    .limit(maxCount).distinct().toArray();

        return valuesIntStream;
    }
}
