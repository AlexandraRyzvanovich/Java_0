package com.epam.arrays.validator;

public class ArrayValidator {

    public Boolean validateValues(String line){
        String regex = "^[\\s\\d\\.]*$";
        boolean result = line.matches(regex);

     return result;
    }

}
