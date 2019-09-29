package com.epam.arrays.utils;

import java.util.Arrays;

public class StreamValuesFinder {
    public double getMin(double[] array) {
        double min = Arrays.stream(array)
                .min().getAsDouble();

        return min;
    }

    public double getMax(double[] array) {
        double arrayS = Arrays.stream(array).summaryStatistics()
                .getMax();

        return arrayS;
    }

    public double getSum(double[] array) {
        double sum = Arrays.stream(array).sum();

        return sum;
    }
    public double getAverage(double[] array) {
        double average = Arrays.stream(array)
                .average().getAsDouble();

        return average;
    }
}
