package com.epam.arrays.reader;

import com.epam.arrays.converter.StringToDoublesConverter;
import com.epam.arrays.exceptions.ReaderException;
import com.epam.arrays.validator.ArrayValidator;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private ArrayList<Double> lines = new ArrayList<>();
    private ArrayValidator validator = new ArrayValidator();
    private StringToDoublesConverter converter = new StringToDoublesConverter();

    public double[] readFile(final String path) throws ReaderException {
        double[] finalArray;
        Path filePath = Paths.get(path);
        BufferedReader bufferedReader = null;
        try {
            String line;
            bufferedReader = Files.newBufferedReader(filePath);
            while ((line = bufferedReader.readLine()) != null) {
                boolean isValid = validator.validateValues(line);
                if (isValid) {
                    List<Double> list = converter.covertStringToDoubles(line);
                    lines.addAll(list);
                }
            }
            finalArray = lines.stream().mapToDouble(d -> d).toArray();

        } catch (Exception ex) {
            throw new ReaderException("Impossible to read a file");

        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception ex) {
                    throw new ReaderException("Connection is closed");
                }
            }
        }
        return finalArray;
    }
}
