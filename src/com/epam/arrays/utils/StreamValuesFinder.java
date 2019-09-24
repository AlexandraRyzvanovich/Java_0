package com.epam.arrays.utils;

import java.util.Arrays;

public class StreamValuesFinder {
    public int getMin(final int[] array) {
        int min = Arrays.stream(array)
                .min().getAsInt();

        return min;
    }

    public int getMax2(final int[] array) {
        int arrayS = Arrays.stream(array).summaryStatistics()
                .getMax();

        return arrayS;
    }

    public int getSum(final int[] array) {
        int sum = Arrays.stream(array).sum();

        return sum;
    }
    public double getAverage(final int[] array) {
        double average = Arrays.stream(array)
                .average().getAsDouble();

        return average;
    }
}
