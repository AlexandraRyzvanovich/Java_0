package com.epam.arrays.validator;

import com.epam.arrays.exceptions.ConverterException;

public class ArrayValidator {
    private final String REGEX = "^([+-]?\\d+(\\.\\d+)?(d|D)?(\\s+|$))+$";

    public Boolean validateValues(final String line) throws ConverterException {

     return line.matches(REGEX);
    }

}
