package com.epam.arrays.utils;

import java.util.Arrays;
import java.util.Comparator;

public class StreamSort {
    public int[] sortDsc(final int[] array) {
        int[] sortedArray = Arrays.stream(array).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue).toArray();

        return sortedArray;
    }

    public int[] sortAsc(final int[] array) {
        int[] sortedArray = Arrays.stream(array)
                                .sorted().toArray();

        return sortedArray;
    }
}
