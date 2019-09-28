package com.epam.arrays.utils;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class ArrayValuesFinderTests {
    ArrayValuesFinder finder;
    @BeforeClass
    public void setUp() {
        finder = new ArrayValuesFinder();
    }

    @DataProvider
    public Object[][] arrays(){
        return new Object[][]{
                {new double[]{5.2, 2.3, 1.0}},
                {new double[]{9.5, 12.2, 4.8}},
                {new double[]{77.7, 88.8, 55.2}}
        };
    }
}
