package com.epam.arrays.reader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.epam.arrays.exceptions.ReaderException;
import com.epam.arrays.convertor.FromStringToDoublesConverter;
import com.epam.arrays.validator.ArrayValidator;

public class Reader {
    private ArrayList<Double> lines = new ArrayList<>();
    ArrayValidator validator = new ArrayValidator();
    FromStringToDoublesConverter converter = new FromStringToDoublesConverter();

    public double[] readFile(String path) throws ReaderException {
        double[] finalArray;
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

        } catch (Exception ex) {
            throw new ReaderException("Impossible to read a file");

        } finally {
            if(bufferedReader!=null)
                try {
                bufferedReader.close();
            } catch (Exception ex) {
                    throw new ReaderException("Buffer reader connection not closed");
                }
        }
        return finalArray;
    }
}
