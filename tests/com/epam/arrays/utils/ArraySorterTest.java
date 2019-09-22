package com.epam.arrays.utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArraySorterTest {
    private final int[] ARRAY = {1, 888, 55, 12, 32};

  //  @DataProvider(name = "arrays")
    public static Object [][] arrays(){
        return new Object[][]{{"1,2,3", true}, {"8,66,87,-58,52", true}};
    }

    @BeforeClass
    public void setUp(){

    }

    @AfterClass
    public void tearDown(){

    }

   // @Test(DataProvider = "arrays")
    public void sortArraySuccessfully(int[] array, boolean expecredResult){

    }

}
