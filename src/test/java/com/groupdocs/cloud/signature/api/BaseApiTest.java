/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 *   Copyright (c) 2003-2020 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.signature.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.client.Configuration;
import com.groupdocs.cloud.signature.client.JSON;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import org.junit.After;
import org.junit.Before;

/**
 * API tests for SignatureApi
 */
public class BaseApiTest {

    protected SignApi signApi;
    protected InfoApi infoApi;
    protected StorageApi storageApi;
    protected FileApi fileApi;
    protected FolderApi folderApi;
    protected Path DownloadFolder;

    public BaseApiTest() {
        super();

        Configuration configuration = new Configuration(Config.AppSID, Config.AppKey);
        configuration.setApiBaseUrl(Config.ApiBaseUrl);

        signApi = new SignApi(configuration);
        infoApi = new InfoApi(configuration);
        storageApi = new StorageApi(configuration);
        fileApi = new FileApi(configuration);
        folderApi = new FolderApi(configuration);

    }    
    
    private static boolean setUpIsDone = false;

    @Before
    public void setUp() throws ApiException, FileNotFoundException {

        if (setUpIsDone) return;        

        DownloadFolder = GetTestDataPath();
        File downloadFolderFile = GetTestDataPath().resolve("Downloaded").toFile();
        
        if (downloadFolderFile.exists())
        {
            ClearFolder(downloadFolderFile);
        }
        else
        {
            downloadFolderFile.mkdirs();
        }

        for (TestFile file : TestFiles.getAllFiles()) {

            ObjectExist response = storageApi.objectExists(new ObjectExistsRequest(file.getPath(), null, null));
            if(!response.getExists())
            {
               File fileObj = getTestFile(file);
               fileApi.uploadFile(new UploadFileRequest(file.getPath(), fileObj, null));
            }
        }

        setUpIsDone = true;
    }

    @After
    public void cleanup() throws ApiException {
        
    }

    public File getTestFile(TestFile testFile) throws FileNotFoundException {
        Path filePath = GetTestDataPath().resolve(testFile.getPath());
        File file = filePath.toFile();
        if (!file.exists())
            throw new FileNotFoundException(file.getAbsolutePath());

        return file;
    }

    public File toJsonFile(Object obj) throws IOException {
        JSON json = new JSON();
        String content = json.serialize(obj);

        File file = File.createTempFile("java", ".json");
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
        fileWriter.write(content);
        fileWriter.close();

        return file;
    }

    private Path GetTestDataPath()
    {
        URL location = BaseApiTest.class.getProtectionDomain().getCodeSource().getLocation();
        Path path = Paths.get(location.getPath().replaceFirst("/", ""));
        path = path.getParent().getParent();
        path = path.resolve("TestData");
        return path;
    }

    private void ClearFolder(File folder) {
        File[] items = folder.listFiles();
        if (items != null) {
            for (File item : items) {
                DeleteFolderRecursively(item);
            }
        }
    }

    private boolean DeleteFolderRecursively(File folder) {
        File[] items = folder.listFiles();
        if (items != null) {
            for (File item : items) {
                DeleteFolderRecursively(item);
            }
        }
        return folder.delete();
    }

    public void DownloadFile(String path) throws ApiException
    {
        DownloadFileRequest requestDownload = new DownloadFileRequest(path, null, null);        
        File responseFile = fileApi.downloadFile(requestDownload);
        
        Path pPath = Paths.get(path);
        String fileName = pPath.getFileName().toString();
        String newFilePath = GetTestDataPath().resolve("Downloaded").resolve(fileName).toString();

        responseFile.renameTo(new File(newFilePath));
    }

}