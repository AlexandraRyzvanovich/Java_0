package com.epam.arrays.reader;

import com.epam.arrays.exceptions.FileReaderException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ReaderTests {
    private Reader reader;

    @BeforeClass
    public void setUp(){
        reader = new Reader();
    }

    @DataProvider
    public Object[] validDataForReader(){
        return new Object[][]{
                {"./resources/DataFileTest", 2}
        };
    }
    @Test(dataProvider = "validDataForReader")
    public void readFileWithValidDataSuccessfully(String path, int expectedength){
        ArrayList<String> actualList = reader.readFile(path);
        Assert.assertNotNull(actualList);
        Assert.assertEquals(actualList.size(),expectedength );
    }


    @DataProvider
    public Object[] invalidDataForReader(){
        return new Object[]
                {"./resources/DataFileTest123"};
    }

    @Test(dataProvider = "invalidDataForReader", expectedExceptions = FileReaderException.class)
    public void readFileWithInvalidDataCatchException(String path) throws FileReaderException {
        reader.readFile(path);
    }
}
