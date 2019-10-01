package com.epam.arrays.utils;

import java.util.Arrays;

public class StreamAction {
    public double getMin(double[] array) {
        return Arrays.stream(array)
                .min().getAsDouble();
    }

    public double getMax(double[] array) {
        return Arrays.stream(array).summaryStatistics()
                .getMax();
    }

    public double getSum(double[] array) {
        return Arrays.stream(array).sum();
    }

    public double getAverage(double[] array) {
        return Arrays.stream(array)
                .average().getAsDouble();
    }
}
