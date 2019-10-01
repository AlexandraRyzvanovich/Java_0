package com.epam.arrays.utils;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StreamActionTests {
    private StreamAction finder;

    @BeforeClass
    public void setUp(){
        finder = new StreamAction();
    }

    @DataProvider
    public Object[][] validDataForMinMaxFinder() {
        return new Object[][]{
                {new double[]{5.2, 2.3, 1.0}, 1.0, 5.2},
                {new double[]{9.5, 12.2, 4.8}, 4.8, 12.2},
                {new double[]{77.7, 88.8, 55.2}, 55.2, 88.8}
        };
    }

    @Test(dataProvider = "validDataForMinMaxFinder")
    public void getMinStreamWithValid_Data(double[] array, double minExpected, double maxExpected){
        double minActual = finder.getMin(array);
        Assert.assertEquals(minActual, minExpected);
        Assert.assertTrue(maxExpected > minActual);
    }

    @Test(dataProvider = "validDataForMinMaxFinder")
    public void getMaxStreamWithValid_Data(double[] array, double minExpected, double maxExpected){
        double maxActual = finder.getMax(array);
        Assert.assertEquals(maxActual, maxExpected);
        Assert.assertTrue(maxActual > minExpected);
    }

    @DataProvider
    public Object[][] validDataForAverageSumFinder(){
        return new Object[][]{
                {new double[]{5.2, 2.3, 1.0}, 8.5},
                {new double[]{9.5, 12.2, 4.8}, 26.5},
                {new double[]{77.7, 88.8, 55.2}, 221.7}
        };
    }

    @Test(dataProvider = "validDataForAverageSumFinder")
    public void getSumWithValidData(double[] array, double sumExpected){
        double sumActual = finder.getSum(array);
        Assert.assertEquals(sumActual, sumExpected);
    }

    @Test(dataProvider = "validDataForAverageSumFinder")
    public void midValueWithValidData(double[] array, double sumExpected) {
        double midActual = finder.getAverage(array);
        double midExpected = sumExpected/array.length;
        Assert.assertEquals(midActual, midExpected);
    }
}
