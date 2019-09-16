package com.epam.task1;

public class ArraySorting {

    public int[] bubbleSort(int[] array){
        boolean sorted = false;
        while (!sorted){
            int permanent;
            sorted = true;
            for(int i = 0; i < array.length-1; i++){
                if(array[i] < array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }

        return array;
    }

    public int[] sortType2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int current = array[i];
            int j = i + 1;
            while (current > array[j] && j < array.length - 1) {
                j++;
            }
        }
        return array;
    }

     public int[] sortType3(int[] array){
        for(int i = 0; i < array.length -1; i++){
            int min= array[i];
            for (int j = 0; i < array.length -1; i++){
                if(min > array[j]){
                    min = array[j];
                }
            }
        }
        return array;
    }
}


