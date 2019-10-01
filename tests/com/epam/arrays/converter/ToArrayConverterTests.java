package com.epam.arrays.converter;

import com.epam.arrays.exceptions.ConverterException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayConverterTests {
    private ToArrayConverter converter;

    @BeforeClass
    public void setUp(){
       converter = new ToArrayConverter();
    }

    @DataProvider
    public Object[][] validParametersForConverter() {
        return new Object[][]{
                {new ArrayList(Arrays.asList("1 28","88 33 9 6", "52"))},
                {new ArrayList(Arrays.asList("1 2 6","8 9 6", "52"))}
        };
    }

    @Test(dataProvider = "validParametersForConverter")
    public void validDataToConvertSuccessfully(ArrayList<String> list){
        double[] actualArray = converter.covertStringToDoubles(list);
        Assert.assertNotNull(actualArray);
        Assert.assertEquals(actualArray.length, 7);
    }

    @DataProvider
    public Object[][] invalidParametersForConverter(){
        return new Object[][]{
                {new ArrayList(Arrays.asList("sfvsfvf","sfv sdvs", "svsv sfvvf"))},
                {new ArrayList(Arrays.asList("4t 5t 6 ","45678g", "eee555"))}
                };
    }
    @Test(dataProvider = "invalidParametersForConverter", expectedExceptions = ConverterException.class)
    public void invalidDataToConvertCatchException(ArrayList<String> list){
        converter.covertStringToDoubles(list);
    }
}
