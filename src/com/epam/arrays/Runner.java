package com.epam.arrays;

import com.epam.arrays.reader.Reader;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

       Reader reader = new Reader();
       ArrayList<Double> list = reader.readFile("C:\\Users\\Alexandra\\IdeaProjects\\Java_0\\Resourses\\DataFile");
        for (double a :
             list) {
            System.out.println(a);

        }

    }
}

