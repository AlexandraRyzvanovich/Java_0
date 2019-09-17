package com.epam.task1;

import java.util.Random;

public class ArrayCreation {
    final int BOUND = 20;
    final int SIZE = 10;

    public int[] getArray() {
        Random random = new Random();
        int[] array = new int[]{2,3,1,9,5};
        //for (int i = 0; i < array.length; i++){
            //array[i] = random.nextInt(BOUND);
          //  System.out.println(array[i]);
        //}
        return array;
    }
    public String[][] getArrayString() {
        String[][] arrayString = new String[SIZE][SIZE];
        return arrayString;
    }

}
