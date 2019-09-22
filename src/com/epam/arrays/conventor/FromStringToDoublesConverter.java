package com.epam.arrays.conventor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FromStringToDoublesConverter {

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
