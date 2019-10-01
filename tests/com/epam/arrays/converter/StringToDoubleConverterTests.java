package com.epam.arrays.converter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class StringToDoubleConverterTests {
    StringToDoublesConverter converter;

    @BeforeClass
    public void setUp(){
       converter = new StringToDoublesConverter();
    }

    @DataProvider
    public Object[][] valid_Parameters_For_Converter() {
        return new Object[][]{{"1 2 3"}, {"852d 522 5"}};
    }

    @DataProvider
    public Object[][] invalid_Parameters_For_Converter(){
        return new Object[][]{{"dfdf dfdf dfdff"}, {"5 word 888"}};
    }

}
