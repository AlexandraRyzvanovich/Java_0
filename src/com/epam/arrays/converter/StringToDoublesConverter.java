package com.epam.arrays.converter;

import java.util.ArrayList;
import java.util.List;

public class StringToDoublesConverter {

    public List<Double> covertStringToDoubles(String line) {
        ArrayList<Double> listDoubles = new ArrayList<>();
        try {
            String[] arr = line.split(" ");
            for (int i = 0; i < arr.length; i++) {
                double value = Double.parseDouble(arr[i]);
                listDoubles.add(value);
            }
        }catch (Exception e){
            System.out.println("fbdcgbdgc");
        }
        return listDoubles;
    }
}
