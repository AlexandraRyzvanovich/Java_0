package com.epam.arrays.validator;

public class ArrayValidator {
    final String regex = "^[\\s\\d\\.]*$";

    public Boolean validateValues(String line){
        boolean result = line.matches(regex);

     return result;
    }

}
