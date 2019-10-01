package com.epam.arrays.validator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayValidatorTests {
    private ArrayValidator validator;

    @BeforeClass
    public void setUp(){
        validator = new ArrayValidator();
    }

    @DataProvider
    public Object[][] validator_Data_Provider(){
        return new Object[][]{
                {"1.0 25.3 58.222 3695.2", true},
                {"1d 55.3 85.4 777.0002", true},
                {"de fd fdds dcfdc", false},
                {"52.3 52.3 52.fff 66.2", false}
        };
    }

    @Test(dataProvider = "validator_Data_Provider")
    public void validatorTest(String line, boolean expectedResult){
        boolean actualResult = validator.validateValues(line);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
