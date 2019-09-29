package com.epam.arrays.converter;

import com.epam.arrays.exceptions.ConverterException;

import java.util.ArrayList;
import java.util.List;

public class StringToDoublesConverter {

    public List<Double> covertStringToDoubles(String line) {
        List<Double> listDoubles = new ArrayList<>();
        try {
            String[] arr = line.split(" ");
            for (String item: arr) {
                double value = Double.parseDouble(item);
                listDoubles.add(value);
            }
        } catch (Exception e) {
            throw new ConverterException ( "Impossible to convert line from a file", e.getCause());
        }
        return listDoubles;
    }
}
