package com.epam.arrays.reader;

import com.epam.arrays.converter.StringToDoublesConverter;
import com.epam.arrays.exceptions.ConverterException;
import com.epam.arrays.exceptions.FileReaderException;
import com.epam.arrays.validator.ArrayValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Reader {

    private static Logger logger;

    public Reader() {

        logger = Logger.getLogger(Reader.class.getName());
    }

    public double[] readFile(String path) {
        double[] finalArray;
        Path filePath = Paths.get(path);
        BufferedReader bufferedReader = null;
        ArrayValidator validator = new ArrayValidator();
        StringToDoublesConverter converter = new StringToDoublesConverter();
        try {
            String line;
            ArrayList<Double> lines = new ArrayList<>();
            bufferedReader = Files.newBufferedReader(filePath);
            while ((line = bufferedReader.readLine()) != null) {
                boolean isValid = validator.validateValues(line);
                  if (isValid) {
                      List<Double> list = converter.covertStringToDoubles(line);
                      lines.addAll(list);
                }
            }
            finalArray = lines.stream().mapToDouble(d -> d).toArray();

        } catch (IOException | NullPointerException ex ) {
            throw new FileReaderException("Invalid path were given", ex);
        } catch (ConverterException e) {
            throw new FileReaderException("Impossible to convert", e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    logger.severe ("Error occurred while bufferReader closing");
                }
            }
        }
        return finalArray;
    }
}
