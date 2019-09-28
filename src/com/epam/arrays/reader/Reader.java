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
import java.util.logging.Logger;

public class Reader {

    private ArrayList<Double> lines;
    private StringToDoublesConverter converter;
    private static Logger logger;

    public Reader() {
        lines = new ArrayList<>();
        converter = new StringToDoublesConverter();
        logger = Logger.getLogger(Reader.class.getName());
    }

    public double[] readFile(String path) {
        double[] finalArray = null;
        Path filePath = Paths.get(path);
        BufferedReader bufferedReader = null;
         ArrayValidator validator = new ArrayValidator();
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
            throw new ReaderException("Impossible to read a file", ex);

        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException e) {
                    logger.info("Error occurred while bufferReader closing");
                }
            }
        }
        return finalArray;
    }
}
