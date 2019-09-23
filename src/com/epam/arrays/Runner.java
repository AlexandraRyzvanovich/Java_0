package com.epam.arrays;

import com.epam.arrays.creator.IntStreamCreator;

public class Runner {
    public static void main(String[] args) {

      int[] array = new int[]{2, 5, 1};

        IntStreamCreator str = new IntStreamCreator();
        System.out.println(str.getMax(array));
        System.out.println(str.getMax2(array));
        int[] ar = str.sort(array);
        for (int a :
             ar) {
            System.out.println(a);
        }
        System.out.println(str.getAverage(array));
        System.out.println(str.getSum(array));



    }
}

