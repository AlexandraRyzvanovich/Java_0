package com.epam.arrays.converter;

import com.epam.arrays.exceptions.ConverterException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class StringToDoubleConverterTest {
    StringToDoublesConverter converter;

    @BeforeClass
    public void setUp(){
       converter = new StringToDoublesConverter();
    }

    @DataProvider
    public Object[][] valid_Parameters_For_Converter() {
        return new Object[][]{{"1 2 3"}, {"852d 522 5"}};
    }

    @Test(dataProvider = "valid_Parameters_For_Converter")
    public void convert_Valid_String_Test(String line){
        List<Double> actualResult = converter.covertStringToDoubles(line);
        Assert.assertNotNull(actualResult);
        Assert.assertEquals(actualResult.size(), 3);
    }

    @DataProvider
    public Object[][] invalid_Parameters_For_Converter(){
        return new Object[][]{{"dfdf dfdf dfdff"}, {"5 word 888"}};
    }

    @Test(dataProvider = "invalid_Parameters_For_Converter", expectedExceptions = ConverterException.class)
    public void convert_Invalid_String_and_Get_Exception_Test(String line) throws ConverterException{
        converter.covertStringToDoubles(line);
    }

}
