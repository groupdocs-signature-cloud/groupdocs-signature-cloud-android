/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 *   Copyright (c) 2003-2023 Aspose Pty Ltd
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

package com.groupdocs.cloud.signature.api.verify;

import com.groupdocs.cloud.signature.api.*;
import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.OptionsBase.SignatureTypeEnum;
import com.groupdocs.cloud.signature.model.VerifyTextOptions.MatchTypeEnum;
import com.groupdocs.cloud.signature.model.requests.*;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class TestsVerifyBarcode extends BaseApiTest {

    @Test
    public void VerifyBarcodeImage() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.ImageStorageSigned.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        VerifyBarcodeOptions options = new VerifyBarcodeOptions();
        PopulateOptions(options);
        VerifySettings VerifySettings = new VerifySettings();
        VerifySettings.setFileInfo(fileInfo);
        VerifySettings.addOptionsItem(options);
        VerifySignaturesRequest request = new VerifySignaturesRequest(VerifySettings);

        // Get and check result 
        VerifyResult response = signApi.verifySignatures(request);

        CheckResponse(VerifySettings.getOptions(), response, testFile);
    }

    @Test
    public void VerifyBarcodePdf() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PdfStorageSigned.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        VerifyBarcodeOptions options = new VerifyBarcodeOptions();
        PopulateOptions(options);
        VerifySettings VerifySettings = new VerifySettings();
        VerifySettings.setFileInfo(fileInfo);
        VerifySettings.addOptionsItem(options);
        VerifySignaturesRequest request = new VerifySignaturesRequest(VerifySettings);

        // Get and check result 
        VerifyResult response = signApi.verifySignatures(request);

        CheckResponse(VerifySettings.getOptions(), response, testFile);
    }

    @Test
    public void VerifyBarcodePresentation() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PresentationStorageSigned.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        VerifyBarcodeOptions options = new VerifyBarcodeOptions();
        PopulateOptions(options);
        VerifySettings VerifySettings = new VerifySettings();
        VerifySettings.setFileInfo(fileInfo);
        VerifySettings.addOptionsItem(options);
        VerifySignaturesRequest request = new VerifySignaturesRequest(VerifySettings);

        // Get and check result 
        VerifyResult response = signApi.verifySignatures(request);

        CheckResponse(VerifySettings.getOptions(), response, testFile);
    }

    @Test
    public void VerifyBarcodeSpreadsheet() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.SpreadsheetStorageSigned.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        VerifyBarcodeOptions options = new VerifyBarcodeOptions();
        PopulateOptions(options);
        VerifySettings VerifySettings = new VerifySettings();
        VerifySettings.setFileInfo(fileInfo);
        VerifySettings.addOptionsItem(options);
        VerifySignaturesRequest request = new VerifySignaturesRequest(VerifySettings);

        // Get and check result 
        VerifyResult response = signApi.verifySignatures(request);

        CheckResponse(VerifySettings.getOptions(), response, testFile);
    }

    @Test
    public void VerifyBarcodeWordProcessing() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.WordProcessingStorageSigned.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        VerifyBarcodeOptions options = new VerifyBarcodeOptions();
        PopulateOptions(options);
        VerifySettings VerifySettings = new VerifySettings();
        VerifySettings.setFileInfo(fileInfo);
        VerifySettings.addOptionsItem(options);
        VerifySignaturesRequest request = new VerifySignaturesRequest(VerifySettings);

        // Get and check result 
        VerifyResult response = signApi.verifySignatures(request);

        CheckResponse(VerifySettings.getOptions(), response, testFile);
    }
   
    public static void PopulateOptions(VerifyBarcodeOptions options)
    {
        options.setPage(1);
        options.setAllPages(true);
        PagesSetup pagesSetup = new PagesSetup();
        pagesSetup.setEvenPages(false);
        pagesSetup.setFirstPage(true);
        pagesSetup.setLastPage(false);
        pagesSetup.setOddPages(false);
        pagesSetup.addPageNumbersItem(1);
        options.setPagesSetup(pagesSetup);

        options.setSignatureType(SignatureTypeEnum.BARCODE);
        options.setBarcodeType("Code39");
        options.setText("123456789012");
        options.setMatchType(MatchTypeEnum.CONTAINS);
    }

    protected void CheckResponse(List<VerifyOptions> VerifyOptions, VerifyResult result, TestFile testFile)
    {
        assertNotNull("Result is empty.", result);
        assertTrue("Result is not true.", result.getIsSuccess());
        assertEquals("Wrong size.", result.getSize(), Long.valueOf(testFile.getSize()));
        assertNotNull("FileInfo is null.", result.getFileInfo());
        assertNotNull("FileInfo FilePath is empty.", result.getFileInfo().getFilePath());
        assertEquals("FileInfo FilePath is wrong.", testFile.getPath(), result.getFileInfo().getFilePath());
    }

}  