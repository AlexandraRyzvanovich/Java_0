package com.epam.arrays.validator;

public class ArrayValidator {
    private final String regex = "^[\\s\\d\\.]*$";

    public Boolean validateValues(final String line) {

     return line.matches(regex);
    }

}
