package com.epam.arrays.utils;

import java.util.Arrays;

public class StreamValuesFinder {
    public static double getMin(double[] array) {
        return Arrays.stream(array)
                .min().getAsDouble();
    }

    public static double getMax(double[] array) {
        return Arrays.stream(array).summaryStatistics()
                .getMax();
    }

    public static double getSum(double[] array) {
        return Arrays.stream(array).sum();
    }

    public static double getAverage(double[] array) {
        return Arrays.stream(array)
                .average().getAsDouble();
    }
}
