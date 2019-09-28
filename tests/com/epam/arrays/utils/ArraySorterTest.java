package com.epam.arrays.utils;

import com.epam.arrays.sorter.ArraySorter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArraySorterTest {

   @DataProvider(name = "arrays")
    public static Object [][] arrays(){
        return new Object[][]{
                {"1, 2, 3", "1, 2, 3"},
                {"8, 5, 4", "4, 5, 8"},

        };
    }

    @BeforeClass
    public void setUp(){
       ArraySorter arraySorter = new ArraySorter();

    }

    @AfterClass
    public void tearDown(){

    }

   @Test(dataProvider =  "arrays")
    public void sortArraySuccessfully(int[] array, boolean expectedResult){

    }

}
