package com.epam.arrays.utils;

import java.util.ArrayList;

public class ValuesFinder {

    public static int getMin(int[] array) {
            int min = array[0];
            for (int i = 0; i < array.length ; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
        return min;
    }

    public static int getMax(int[] array){
        int max = array[array.length-1];
        for (int i = array.length-1; i >= 0; i--){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static int getSum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum+=array[i];
        }
        return sum;
    }

    public static double[] addValue(double[] array, int value){
        for (int i = 0; i < array.length; i++) {
            array[i]+=value;
        }
        return array;
    }

    public static int midValue(int[] array){
        int sum = getSum(array);
        int length = array.length;
        int mid = sum / length;

        return mid;
    }
}

