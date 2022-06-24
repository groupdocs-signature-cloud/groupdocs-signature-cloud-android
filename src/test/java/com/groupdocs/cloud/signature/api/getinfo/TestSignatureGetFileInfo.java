/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 *   Copyright (c) 2003-2022 Aspose Pty Ltd
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

package com.groupdocs.cloud.signature.api.getinfo;

import static org.junit.Assert.*;

import com.groupdocs.cloud.signature.api.*;
import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.requests.*;
import com.groupdocs.cloud.signature.model.*;

import org.junit.Test;

public class TestSignatureGetFileInfo extends BaseApiTest {

    @Test
    public void GetDocumentInfo() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PdfStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        InfoSettings infoSettings = new InfoSettings();
        infoSettings.setFileInfo(fileInfo);
        GetInfoRequest request = new GetInfoRequest(infoSettings);        

        // Get and check result 
        InfoResult response = infoApi.getInfo(request);
        
        assertEquals("Size", response.getSize(), Long.valueOf(testFile.size));
        assertEquals("Extension", response.getExtension(), testFile.getExtension());
        assertEquals("FileFormat", response.getFileFormat(), testFile.getFileFormat());
        assertEquals("MaxPageHeight", response.getMaxPageHeight().intValue(), testFile.getMaxPageHeight());
        assertEquals("MaxPageWidth", response.getWidthForMaxHeight().intValue(), testFile.getMaxPageWidth());
        assertEquals("PagesCount", response.getPagesCount().intValue(), testFile.getPagesCount());
        assertEquals("Path", response.getFileInfo().getFilePath(), testFile.getPath());
    }

    @Test
    public void getInfoReturnsFileNotFoundTest()
    {
        // Arrange
        InfoSettings infoSettings = new InfoSettings();
        infoSettings.setFileInfo(TestFiles.NotExist.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(infoSettings);

        // Act & Assert  
        try {
            infoApi.getInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'some-folder\\NotExist.docx'.", ex.getMessage());
        }  
    }    
}  
