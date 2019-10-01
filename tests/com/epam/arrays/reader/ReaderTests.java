package com.epam.arrays.reader;

import com.epam.arrays.exceptions.FileReaderException;
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
                {"./resources/DataFileTest", 3}
        };
    }

    @DataProvider
    public Object[] file_InvalidPath_Provider(){
        return new Object[]
                {"./resources/DataFileTest123"};
    }

    @Test(dataProvider = "file_InvalidPath_Provider", expectedExceptions = FileReaderException.class)
    public void read_File_Exception_Test(String path) throws FileReaderException {
        reader.readFile(path);
    }
}
