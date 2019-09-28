package com.epam.arrays.validator;

public class ArrayValidator {
    private final String regex = "^([+-]?\\d+(\\.\\d+)?(d|D)?(\\s+|$))+$";

    public Boolean validateValues(final String line) {

     return line.matches(regex);
    }

}
