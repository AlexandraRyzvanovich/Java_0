package com.epam.arrays.reader;

import com.epam.arrays.exceptions.FileReaderException;
import com.epam.arrays.validator.ArrayValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Reader {

    private static Logger logger;

    public Reader() {
        logger = Logger.getLogger(Reader.class.getName());
    }

    public ArrayList<String> readFile(String path) {
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader bufferedReader = null;
        ArrayValidator validator = new ArrayValidator();
        Path filePath = Paths.get(path);
        try {
            String line;
            bufferedReader = Files.newBufferedReader(filePath);
            while ((line = bufferedReader.readLine()) != null) {
                boolean isValid = validator.validateValues(line);
                  if (isValid) {
                      lines.add(line);
                }
            }
        } catch (IOException ex) {
            throw new FileReaderException("Exception occurred while reading a file", ex);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    logger.severe ("Error occurred while closing bufferReader");
                }
            }
        }
        return lines;
    }
}
