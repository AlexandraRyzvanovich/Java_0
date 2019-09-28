package com.epam.arrays.utils;

public class ArrayValuesFinder {

    public double getMin(double[] array) {
        double min = array[0];
        for (double value : array) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

    public double getMax(double[] array) {
        double max = array[array.length - 1];
        for (int i = array.length - 1; i >= 0; i--) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public double getSum( double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum;
    }

    public double[] addValue( final double[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] += value;
        }
        return array;
    }

    public double midValue(double[] array) {
        double sum = getSum(array);
        int length = array.length;
        double mid = sum / length;

        return mid;
    }
}

