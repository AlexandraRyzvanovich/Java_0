package com.epam.arrays.sorter;

import java.util.Arrays;
import java.util.Comparator;

public class StreamSorter {

    public double[] sortDesc(double[] array) {
        return Arrays.stream(array).boxed()
                .sorted(Comparator.reverseOrder())
                    .mapToDouble(Double::doubleValue).toArray();
    }

    public double[] sortAsc(double[] array) {
        return  Arrays.stream(array)
                .sorted().toArray();
    }
}
