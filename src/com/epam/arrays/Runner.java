package com.epam.arrays;

import com.epam.arrays.reader.Reader;

public class Runner {
    public static void main(String[] args) {

       Reader reader = new Reader();
       double[] list = reader.readFile("C:\\Users\\User\\IdeaProjects\\Java_0\\Resourses\\DataFile");
        for (double a :
             list) {
            System.out.println(a);
        }
    }
}

