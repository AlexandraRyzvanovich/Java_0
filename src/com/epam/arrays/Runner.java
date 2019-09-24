package com.epam.arrays;

import com.epam.arrays.creator.IntStreamCreator;

public class Runner {
    public static void main(String[] args) {

        IntStreamCreator creator = new IntStreamCreator();
        int[] array = creator.getIntStream();
        for (int a: array) {
            System.out.println(a);

        }
    }
}

