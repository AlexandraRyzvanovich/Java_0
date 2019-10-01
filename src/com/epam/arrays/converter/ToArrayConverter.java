package com.epam.arrays.converter;

import com.epam.arrays.exceptions.ConverterException;

import java.util.ArrayList;
import java.util.List;

public class ToArrayConverter {

    public double[] covertStringToDoubles(ArrayList<String> list) {
        List<Double> listDoubles = new ArrayList<>();
        double[] finalArray;
        try {
            for (String line : list) {
                String[] arr = line.split(" ");
                for (String item : arr) {
                    double value = Double.parseDouble(item);
                    listDoubles.add(value);
                }
            }
            finalArray = listDoubles.stream().mapToDouble(d -> d).toArray();
        }catch (NumberFormatException ex){
            throw new ConverterException("Impossible to convert string", ex);
        }
        return finalArray;
    }
}
