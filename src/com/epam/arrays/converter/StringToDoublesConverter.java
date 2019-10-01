package com.epam.arrays.converter;

import java.util.ArrayList;
import java.util.List;

public class StringToDoublesConverter {

    public double[] covertStringToDoubles(ArrayList<String> list) {
        List<Double> listDoubles = new ArrayList<>();
        double[] finalArray;
        for (String line: list) {
            String[] arr = line.split(" ");
            for (String item: arr) {
                double value = Double.parseDouble(item);
                listDoubles.add(value);
            }
        }
            finalArray = listDoubles.stream().mapToDouble(d -> d).toArray();

        return finalArray;
    }
}
