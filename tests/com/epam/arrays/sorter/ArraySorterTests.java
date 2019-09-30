package com.epam.arrays.sorter;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArraySorterTests {
    ArraySorter arraySorter;

    @BeforeClass
    public void setUp(){
        arraySorter = new ArraySorter();
    }

   @DataProvider
    public Object [][] arrays(){
        return new Object[][]{
                {new double[]{1.8, 2.2, 3.9, 1.5}, 1.5, 3.9},
                {new double[]{8, 5, 4.5, 6.2, 88.2, 4.3}, 4.3, 88.2 },
                {new double[]{99, 9.9, 58}, 9.9, 99}
        };
    }

   @Test(dataProvider =  "arrays")
    public void bubbleSortTest(double[] array, double lastExpected, double firstExpected){
       arraySorter.bubbleSortDesc(array);
       Assert.assertEquals(array[0], firstExpected);
       Assert.assertEquals(lastExpected, array[array.length - 1]);
    }

    @Test(dataProvider = "arrays")
    public void swapSortTest(double[] array, double firstExpected , double lastExpected){
        arraySorter.swapSortAsc(array);
        Assert.assertEquals(array[0], firstExpected);
        Assert.assertEquals(lastExpected, array[array.length - 1]);
    }

    @Test(dataProvider = "arrays")
    public void selectionSortTest(double[] array, double firstExpected , double lastExpected){
        arraySorter.selectionSortAsc(array);
        Assert.assertEquals(array[0], firstExpected);
        Assert.assertEquals(lastExpected, array[array.length - 1]);
    }

    @Test(dataProvider = "arrays")
    public void insertionSortTest(double[] array, double firstExpected , double lastExpected){
        arraySorter.insertionSortAsc(array);
        Assert.assertEquals(array[0], firstExpected);
        Assert.assertEquals(lastExpected, array[array.length - 1]);
    }
}
