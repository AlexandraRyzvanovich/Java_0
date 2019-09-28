package com.epam.arrays.sorter;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StreamSorterTests {
    StreamSorter sorter;
    @BeforeClass
    public void setUp(){
        sorter = new StreamSorter();
    }

    @DataProvider
    public Object [][] arrays(){
        return new Object[][]{
                {new double[]{1.8, 2.2, 3.9, 1.5}, 1.5, 3.9},
                {new double[]{8, 5, 4.5, 6.2, 88.2, 4.3}, 4.3, 88.2 },
                {new double[]{99, 9.9, 58}, 9.9, 99}
        };
    }

    @Test(dataProvider = "arrays")
    public void sortDescTest(double[] array, double lastExpected, double firstExpected){
        double[] sortedArray = sorter.sortDesc(array);
        Assert.assertEquals(sortedArray[0], firstExpected);
        Assert.assertEquals( sortedArray[array.length - 1], lastExpected);
    }

    @Test(dataProvider = "arrays")
    public void sortAscTest(double[] array, double firstExpected, double lastExpected){
        double[] sortedArray = sorter.sortAsc(array);
        Assert.assertEquals(sortedArray[0], firstExpected);
        Assert.assertEquals( sortedArray[array.length - 1], lastExpected);
    }

}
