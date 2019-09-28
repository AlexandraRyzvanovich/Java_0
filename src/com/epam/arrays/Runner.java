package com.epam.arrays;

import com.epam.arrays.reader.Reader;

public class Runner {

    public static void main(String[] args) {
        Reader reader = new Reader();
        double[] array = reader.readFile("C:\\Users\\Alexandra\\IdeaProjects\\Java_0\\resources\\DataFileTest");
        System.out.println(array.length);


    }
}

