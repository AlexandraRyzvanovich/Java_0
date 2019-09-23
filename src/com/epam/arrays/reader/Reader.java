package com.epam.arrays.reader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.epam.arrays.converter.*;
import com.epam.arrays.validator.ArrayValidator;


public class Reader {
    ArrayValidator validator = new ArrayValidator();
    StringToDoublesConverter converter = new StringToDoublesConverter();
    ListToDoublesArrayConverter doublesArrayConverter = new ListToDoublesArrayConverter();

    public double[] readFile(String path) {
        ArrayList<Double> lines = new ArrayList<>();
        double[] finalArray = new double[]{};
        Path filePath = Paths.get(path);
        BufferedReader bufferedReader = null;
        String line;
        try {
           bufferedReader = Files.newBufferedReader(filePath);
            while ((line = bufferedReader.readLine()) != null){
                boolean isValid = validator.validateValues(line);
                if(isValid){
                    List<Double> validValuesList = converter.covertStringToDoubles(line);
                    for (double a:validValuesList) {
                        lines.add(a);
                    }
                }
            }
            finalArray = doublesArrayConverter.convertToDoublesArray(lines);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if(bufferedReader!=null)
                try {
                bufferedReader.close();
            } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return finalArray;
    }
}
