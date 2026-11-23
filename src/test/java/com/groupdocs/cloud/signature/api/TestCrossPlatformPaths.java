package com.groupdocs.cloud.signature.api;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import org.junit.Test;

public class TestCrossPlatformPaths {

    @Test
    public void testDataFilesResolveFromTestDataDirectory() throws FileNotFoundException {
        BaseApiTest baseApiTest = new BaseApiTest();
        for (TestFile testFile : TestFiles.getAllFiles()) {
            assertTrue("Test data file does not exist: " + testFile.getPath(),
                    baseApiTest.getTestFile(testFile).isFile());
        }
    }
}
