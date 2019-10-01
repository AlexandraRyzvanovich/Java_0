package com.epam.arrays.sorter;

import com.epam.arrays.exceptions.ArrayActionException;

public class ArraySorter {

    public double[] bubbleSortDesc (double[] array) {
        if(array == null){
            throw new ArrayActionException("Array is null. Impossible to sort. ");
        }
        boolean sorted = false;
        while (!sorted) {
            double permanent;
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    permanent = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = permanent;
                    sorted = false;
                }
            }
        }
        return array;
    }

    public double[] swapSortAsc(double[] array) {
        if(array == null){
            throw new ArrayActionException("Array is null. Impossible to sort. ");
        }
        boolean checked = false;
        while (!checked) {
            checked = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    checked = false;
                }
            }
        }
        return array;
    }

    public double[] selectionSortAsc(double[] array) {
        if(array == null){
            throw new ArrayActionException("Array is null. Impossible to sort. ");
        }
        for (int i = 0; i < array.length - 1; i++) {
            int ind = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[ind]) {
                    ind = j;
                }
            }
            swap(array, i, ind);
        }
        return array;
    }

    public double[] insertionSortAsc(double[] array) {
        if(array == null){
            throw new ArrayActionException("Array is null. Impossible to sort. ");
        }
        for (int i = 1; i < array.length; i++) {
            double value = array[i];
            int iterator = i - 1;
            while (iterator >= 0 && value < array[iterator]) {
                array[iterator + 1] = array[iterator];
                iterator--;
            }
            array[iterator + 1] = value;
        }
        return array;
    }

    private void swap(double[] array, int idx1, int idx2) {
        double temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}

