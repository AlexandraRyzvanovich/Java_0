package com.epam.arrays.converter;

import com.epam.arrays.exceptions.ConverterException;

import java.util.ArrayList;
import java.util.List;

public class FromStringToDoublesConverter {

    public List<Double> covertStringToDoubles(String line) throws ConverterException {
        ArrayList<Double> listDoubles = new ArrayList<>();
        try {
            String[] arr = line.split(" ");
            for (int i = 0; i < arr.length; i++) {
                double value = Double.parseDouble(arr[i]);
                listDoubles.add(value);
            }
        }catch (Exception e){
            throw new ConverterException("String line from file is not valid");
        }
        return listDoubles;
    }
}
