package com.epam.arrays.converter;

import com.epam.arrays.exceptions.ConverterException;

import java.util.ArrayList;
import java.util.List;

public class StringToDoublesConverter {

    public List<Double> covertStringToDoubles(String line) {
        List<Double> listDoubles = new ArrayList<>();;
        try {
            String[] arr = line.split(" ");
            for (int i = 0; i < arr.length; i++) {
                double value = Double.parseDouble(arr[i]);
                listDoubles.add(value);
            }
        }catch (Exception e){
            throw new ConverterException("Impossible to convert line from a file", e.getCause());
        }
        return listDoubles;
    }
}
