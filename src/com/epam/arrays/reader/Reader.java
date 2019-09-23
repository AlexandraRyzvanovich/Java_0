package com.epam.arrays.reader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import com.epam.arrays.conventor.FromStringToDoublesConverter;
import com.epam.arrays.validator.ArrayValidator;

public class Reader {
    private ArrayList<Double> lines = new ArrayList<>();
    ArrayValidator validator = new ArrayValidator();
    FromStringToDoublesConverter converter = new FromStringToDoublesConverter();

    public double[] readFile(String path) {
        double[] finalArray = new double[]{};
        Path filePath = Paths.get(path);
        BufferedReader bufferedReader = null;
        String line;
        try {
           bufferedReader = Files.newBufferedReader(filePath);
            while ((line = bufferedReader.readLine()) != null){
                boolean isValid = validator.validateValues(line);
                if(isValid){
                    List<Double> list = converter.covertStringToDoubles(line);
                    for (double a:list) {
                       lines.add(a);
                    }
                }
            }
            finalArray = lines.stream().mapToDouble(d -> d).toArray();

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
