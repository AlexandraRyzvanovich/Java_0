package com.epam.task1;

public class ArrayPerformance {
    public static void main(String[] args) {
        ArrayCreation arrayCreation = new ArrayCreation();
        int[] array = arrayCreation.getArray();

        ArraySorting arraySorting = new ArraySorting();
        //int[] bubbleSorted = arraySorting.bubbleSort(array);
        //for (int v:
        //     bubbleSorted) {
        //    System.out.println(v);
       // }
       //int[] sorting2 = arraySorting.insertionSort(array);
       // for (int a:
       //    sorting2) {
        //   System.out.println(a);

      // }
        int[] sorting3 = arraySorting.insertionSort(array);
        for (int a:
                sorting3) {
            System.out.println(a);

        }

    }
}
