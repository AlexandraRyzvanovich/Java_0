package com.epam.arrays.converter;

import java.util.ArrayList;

public class ListToDoublesArrayConverter {
    public double[] convertToDoublesArray(ArrayList<Double> list){
        double[] array = list.stream().mapToDouble(d -> d).toArray();

        return array;
    }

}
