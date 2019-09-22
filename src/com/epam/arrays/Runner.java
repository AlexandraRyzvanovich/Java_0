package com.epam.arrays;

import com.epam.arrays.reader.Reader;
import com.epam.arrays.utils.ValuesFinder;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

       Reader reader = new Reader();
       double[] list = reader.readFile("C:\\Users\\Alexandra\\IdeaProjects\\Java_0\\Resourses\\DataFile");
        ValuesFinder finder = new ValuesFinder();
        double[] aa = finder.addValue(list, 8);
        for (double a:
             aa) {
            System.out.println(a);

        }


    }
}

