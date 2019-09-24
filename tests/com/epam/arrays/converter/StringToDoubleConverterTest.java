package com.epam.arrays.converter;

import org.testng.annotations.Test;

import java.util.List;

public class StringToDoubleConverterTest {

    public void setUp(){

    }

    @Test
    public void convertValidStringTest(String line, boolean expectedResult){
        StringToDoublesConverter converter = new StringToDoublesConverter();
        List<Double> list = converter.covertStringToDoubles(line);







    }

}
