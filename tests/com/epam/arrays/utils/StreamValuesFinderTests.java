package com.epam.arrays.utils;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StreamValuesFinderTests {
    StreamValuesFinder finder;
    @BeforeClass
    public void setUp(){
        finder = new StreamValuesFinder();
    }

    @DataProvider
    public Object[][] data_For_Min_Max_Finder() {
        return new Object[][]{
                {new double[]{5.2, 2.3, 1.0}, 1.0, 5.2},
                {new double[]{9.5, 12.2, 4.8}, 4.8, 12.2},
                {new double[]{77.7, 88.8, 55.2}, 55.2, 88.8}
        };
    }

    @Test(dataProvider = "data_For_Min_Max_Finder")
    public void getMin_StreamTest_Valid_Data(double[] array, double minExpected, double maxExpected){
        double minActual = finder.getMin(array);
        Assert.assertNotNull(minActual);
        Assert.assertEquals(minActual, minExpected);
        Assert.assertTrue(maxExpected > minActual);
    }

    @Test(dataProvider = "data_For_Min_Max_Finder")
    public void getMax_StreamTest_Valid_Data(double[] array, double minExpected, double maxExpected){
        double maxActual = finder.getMax(array);
        Assert.assertNotNull(maxActual);
        Assert.assertEquals(maxActual, maxExpected);
        Assert.assertTrue(maxActual > minExpected);
    }

    @DataProvider
    public Object[][] data_For_Average_Sum_Finder(){
        return new Object[][]{
                {new double[]{5.2, 2.3, 1.0}, 8.5},
                {new double[]{9.5, 12.2, 4.8}, 26.5},
                {new double[]{77.7, 88.8, 55.2}, 221.7}
        };
    }

    @Test(dataProvider = "data_For_Average_Sum_Finder")
    public void getSumTest_Valid_Data(double[] array, double sumExpected){
        double sumActual = finder.getSum(array);
        Assert.assertNotNull(sumActual);
        Assert.assertEquals(sumActual, sumExpected);
    }

    @Test(dataProvider = "data_For_Average_Sum_Finder")
    public void midValueTest_Valid_Data(double[] array, double sumExpected) {
        double midActual = finder.getAverage(array);
        double midExpected = sumExpected/array.length;
        Assert.assertNotNull(midActual);
        Assert.assertEquals(midActual, midExpected);
    }




}
