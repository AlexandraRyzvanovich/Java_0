package com.epam.arrays.utils;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayValuesFinderTests {
    ArrayValuesFinder finder;

    @BeforeClass
    public void setUp() {
        finder = new ArrayValuesFinder();
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
    public void getMinTest_Valid_Data(double[] array, double minExpected, double maxExpected){
        double minActual = ArrayValuesFinder.getMin(array);
        Assert.assertNotNull(minActual);
        Assert.assertEquals(minActual, minExpected);
        Assert.assertTrue(maxExpected > minActual);
    }

    @Test(dataProvider = "data_For_Min_Max_Finder")
    public void getMaxTest_Valid_Data(double[] array, double minExpected, double maxExpected){
        double maxActual = ArrayValuesFinder.getMax(array);
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
        double sumActual = ArrayValuesFinder.getSum(array);
        Assert.assertNotNull(sumActual);
        Assert.assertEquals(sumActual, sumExpected);
    }

    @Test(dataProvider = "data_For_Average_Sum_Finder")
    public void midValueTest_Valid_Data(double[] array, double sumExpected) {
        double midActual = ArrayValuesFinder.midValue(array);
        double midExpected = sumExpected/array.length;
        Assert.assertNotNull(midActual);
        Assert.assertEquals(midActual, midExpected);
    }

    @DataProvider
    public Object[][] data_For_AddValue_Finder(){
        return new Object[][]{
                {new double[]{5.2, 2.3, 1.0}, 8.0, new double[]{13.2, 10.3, 9.0}},
                {new double[]{9.5, 12.2, 4.8}, 5.3, new double[]{14.8, 17.5, 10.1}},
                {new double[]{77.7, 88.8, 55.2}, 50.0, new double[]{127.7, 138.8, 105.2}}
        };
    }
    @Test(dataProvider = "data_For_AddValue_Finder")
    public void addValueTest_Valid_Data(double[] arrayInitial, double valueToAdd, double[] arrayExpected){
        double[] arrayActual = ArrayValuesFinder.addValue(arrayInitial, valueToAdd);
        Assert.assertNotNull(arrayActual);
        Assert.assertTrue(Arrays.equals(arrayActual, arrayExpected));
    }
}
