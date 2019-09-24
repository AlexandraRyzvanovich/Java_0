package com.epam.arrays.reader;

import com.epam.arrays.converter.StringToDoublesConverter;
import com.epam.arrays.exceptions.ReaderException;
import com.epam.arrays.validator.ArrayValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private ArrayList<Double> lines;
    private StringToDoublesConverter converter;

    public Reader() {
        lines = new ArrayList<>();
        converter = new StringToDoublesConverter();
    }

    public double[] readFile(final String path) throws IOException {
        double[] finalArray = null;
        Path filePath = Paths.get(path);
        BufferedReader bufferedReader = null;
         ArrayValidator validator = new ArrayValidator();
        try {
            String line;
            bufferedReader = Files.newBufferedReader(filePath);
            while ((line = bufferedReader.readLine()) != null) {
                boolean isValid = validator.validateValues(line);
              try {
                  if (isValid) {
                      List<Double> list = converter.covertStringToDoubles(line);
                      lines.addAll(list);
                  } else {
                      throw new ReaderException("The string is not valid");
                  }
                }
              catch (ReaderException e) {
                  System.out.println ( "The error is:"  +  e.getMessage());
              }
            }
            finalArray = lines.stream().mapToDouble(d -> d).toArray();

        } catch (IOException ex) {
            System.out.println("File problems occurred");

        } catch (Exception ex) {
            ex.getMessage();

        } finally {
            if(bufferedReader != null) {
                bufferedReader.close();
            }
        }
        return finalArray;
    }
}
