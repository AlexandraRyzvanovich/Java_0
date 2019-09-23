package com.epam.arrays.utils;

import java.util.Arrays;
import java.util.Comparator;

public class StreamSort {
    public int[] sortDsc(int[] array) {
        int[] sortedArray = Arrays.stream(array).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue).toArray();

        return sortedArray;
    }

    public int[] sortAsc(int[] array) {
        int[] sortedArray = Arrays.stream(array)
                                .sorted().toArray();

        return sortedArray;
    }
}
