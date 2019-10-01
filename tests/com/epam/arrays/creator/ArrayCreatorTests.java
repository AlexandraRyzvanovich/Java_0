package com.epam.arrays.creator;

import com.epam.arrays.exceptions.CreatorException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayCreatorTests {
    private ArrayCreator creator;

    @BeforeClass
    public void setUp() {
        creator = new ArrayCreator();
    }

    @DataProvider
    public Object[][] validDataToCreateArray(){
        return new Object[][] {{10, 2}, {5, 80}};
    }

    @Test(dataProvider = "validDataToCreateArray")
    public void createArrayWithValidDataSuccessfully(int expectedSize, int valueRange){
        int[] array = creator.getArray(expectedSize, valueRange);
        int actualSize = array.length;
        Assert.assertNotNull(array);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @DataProvider
    public Object[][] invalidDataToCreateArray(){
        return new Object[][]{{-10, -2}, {-5, -80}};
    }

    @Test(dataProvider = "invalidDataToCreateArray", expectedExceptions = CreatorException.class)
    public void createArrayWithInvalidDataCatchException(int size, int valueRange) throws CreatorException{
        creator.getArray(size, valueRange);
    }

    @DataProvider
    public Object[][] validDataToCreateStreamArray(){
        return new Object[][]{{10, 20, 50}, {1, 10, 20}};
    }

    @Test(dataProvider = "validDataToCreateStreamArray")
    public void createStreamArrayWithValidDataSuccessfully(int min, int max, int maxCount) {
        int[] array = creator.getIntStream(min, max, maxCount);
        Assert.assertNotNull(array);
        int actualSize = array.length;
        Assert.assertTrue(actualSize <= maxCount);
    }
    @DataProvider
    public Object[][] invalidDataToCreateStreamArray(){
        return new Object[][]{{10, 20, -50}, {1, 10, -20}};
    }

    @Test(dataProvider = "invalidDataToCreateStreamArray", expectedExceptions = CreatorException.class)
    public void createStreamArrayWithInvalidDataCatchException(int min, int max, int maxCount) throws CreatorException{
        creator.getIntStream(min, max, maxCount);
    }
}
