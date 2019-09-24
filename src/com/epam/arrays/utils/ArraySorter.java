package com.epam.arrays.utils;

public class ArraySorter {

    public int[] bubbleSort(final int[] array) {
        boolean sorted = false;
        while (!sorted) {
            int permanent;
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

    public int[] swapSort(final int[] array) {
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

    public int[] selectionSort(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int ind = i;
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[j] < array[ind]) {
                    ind = j;
                }
            }
            swap(array, i, ind);
        }
        return array;
    }

    public int[] insertionSort(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int iterator = i - 1;
            while (iterator >= 0 && value < array[iterator]) {
                array[iterator + 1] = array[iterator];
                iterator--;
            }
            array[iterator + 1] = value;
        }
        return array;
    }

    private void swap(final int[] array, final int idx1, final int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}

