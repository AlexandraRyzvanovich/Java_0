package com.epam.arrays.sorter;

import com.epam.arrays.exceptions.ArrayActionException;

import java.util.Arrays;
import java.util.Comparator;

public class StreamSorter {

    public double[] sortDesc(double[] array) {
        if(array == null){
            throw new ArrayActionException("Array is null. Impossible to sort. ");
        }
        return Arrays.stream(array).boxed()
                .sorted(Comparator.reverseOrder())
                    .mapToDouble(Double::doubleValue).toArray();
    }

    public double[] sortAsc(double[] array) {
        if(array == null){
            throw new ArrayActionException("Array is null. Impossible to sort. ");
        }
        return  Arrays.stream(array)
                .sorted().toArray();
    }
}
