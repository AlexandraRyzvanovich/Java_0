package com.epam.arrays.reader;

import com.epam.arrays.exceptions.ReaderException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReaderTests {
    Reader reader;
    @BeforeClass
    public void setUp(){
        reader = new Reader();
    }

    @DataProvider
    public Object[] file_ValidPath_Provider(){
        return new Object[][]{
                {"C:\\Users\\Alexandra\\IdeaProjects\\Java_0\\resources\\DataFileTest", 3}
        };
    }

    @Test(dataProvider = "file_ValidPath_Provider")
    public void read_Valid_File_Test(String path, int expectedLength){
        double[] array = reader.readFile(path);
        Assert.assertNotNull(array);
        Assert.assertTrue(array.length == expectedLength);
    }

    @DataProvider
    public Object[] file_InvalidPath_Provider(){
        return new Object[]
                {"C:\\Users\\Alexandra\\IdeaProjects\\Java_0\\resources\\"};
    }

    @Test(dataProvider = "file_InvalidPath_Provider", expectedExceptions = ReaderException.class)
    public void read_File_Exception_Test(String path) throws ReaderException {
        reader.readFile(path);
    }
}
