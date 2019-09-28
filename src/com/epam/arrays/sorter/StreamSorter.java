package com.epam.arrays.sorter;

import java.util.Arrays;
import java.util.Comparator;

public class StreamSorter {
    public double[] sortDesc(double[] array) {
        double[] sortedArray = Arrays.stream(array).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToDouble(Double::doubleValue).toArray();

        return sortedArray;
    }

    public double[] sortAsc(double[] array) {
        double[] sortedArray = Arrays.stream(array)
                                .sorted().toArray();

        return sortedArray;
    }
}
