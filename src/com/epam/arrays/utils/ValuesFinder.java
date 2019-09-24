package com.epam.arrays.utils;

public class ValuesFinder {

    public int getMin(int[] array) {
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
        return min;
    }

    public int getMax(int[] array) {
        int max = array[array.length - 1];
        for (int i = array.length - 1; i >= 0; i--) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int getSum( final int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public double[] addValue(double[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] += value;
        }
        return array;
    }

    public int midValue(int[] array) {
        int sum = getSum(array);
        int length = array.length;
        int mid = sum / length;

        return mid;
    }
}

