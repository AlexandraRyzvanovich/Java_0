package com.epam.arrays.converter;

import com.epam.arrays.exceptions.ConverterException;

import java.util.ArrayList;
import java.util.List;

public class StringToDoublesConverter {

    public List<Double> covertStringToDoubles(final String line) {
        ArrayList<Double> listDoubles = new ArrayList<>();

            String[] arr = line.split(" ");
            for (int i = 0; i < arr.length; i++) {
                try {
                    double value = Double.parseDouble(arr[i]);
                    listDoubles.add(value);
                } catch (ConverterException e) {
                    System.out.println("Error occurred while parsing String to Double."
                            + "Error: " + e.getMessage());
                }
            }

        return listDoubles;
    }
}
