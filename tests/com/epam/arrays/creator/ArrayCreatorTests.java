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
    public Object[][] valid_Data_To_Create_Array(){
        return new Object[][] {{10, 2}, {5, 80}};
    }

    @Test(dataProvider = "valid_Data_To_Create_Array")
    public void check_Random_Created_Array(int expectedSize, int valueRange){
        int[] array = creator.getArray(expectedSize, valueRange);
        int actualSize = array.length;
        Assert.assertNotNull(array);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @DataProvider
    public Object[][] invalid_Data_To_Create_Array(){
        return new Object[][]{{-10, -2}, {-5, -80}};
    }

    @Test(dataProvider = "invalid_Data_To_Create_Array", expectedExceptions = CreatorException.class)
    public void check_Random_Creator_Array_Exception(int size, int valueRange) throws CreatorException{
        creator.getArray(size, valueRange);
    }

    @DataProvider
    public Object[][] valid_Data_To_Create_Stream_Array(){
        return new Object[][]{{10, 20, 50}, {1, 10, 20}};
    }

    @Test(dataProvider = "valid_Data_To_Create_Stream_Array")
    public void check_Stream_Creator_Array(int min, int max, int maxCount) {
        int[] array = creator.getIntStream(min, max, maxCount);
        Assert.assertNotNull(array);
        int actualSize = array.length;
        Assert.assertTrue(actualSize <= maxCount);
    }
    @DataProvider
    public Object[][] invalid_Data_To_Create_Stream_Array(){
        return new Object[][]{{10, 20, -50}, {1, 10, -20}};
    }

    @Test(dataProvider = "invalid_Data_To_Create_Stream_Array", expectedExceptions = CreatorException.class)
    public void check_Stream_Creator_Array_Exception(int min, int max, int maxCount) throws CreatorException{
        creator.getIntStream(min, max, maxCount);
    }
}
