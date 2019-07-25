/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
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

package com.groupdocs.cloud.signature.api.sign;

import com.groupdocs.cloud.signature.api.*;
import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.OptionsBase.DocumentTypeEnum;
import com.groupdocs.cloud.signature.model.OptionsBase.SignatureTypeEnum;
import com.groupdocs.cloud.signature.model.SignImageOptions.HorizontalAlignmentEnum;
import com.groupdocs.cloud.signature.model.SignImageOptions.LocationMeasureTypeEnum;
import com.groupdocs.cloud.signature.model.SignImageOptions.MarginMeasureTypeEnum;
import com.groupdocs.cloud.signature.model.SignImageOptions.SizeMeasureTypeEnum;
import com.groupdocs.cloud.signature.model.SignImageOptions.VerticalAlignmentEnum;
import com.groupdocs.cloud.signature.model.requests.*;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class TestsSignDigital extends BaseApiTest {

    @Test
    public void SignDigitalImage() throws ApiException
    {
        //Digital signature is not supported for Images.
    }

    @Test
    public void SignDigitalPdf() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PdfStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\PdfDigitalSigned." + testFile.extension;

        SignDigitalOptions options = new SignDigitalOptions();
        PopulateOptions(options);
        options.setDocumentType(DocumentTypeEnum.PDF);
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setOutputFilePath(signedFileName);
        SignSettings signSettings = new SignSettings();
        signSettings.setFileInfo(fileInfo);
        signSettings.addOptionsItem(options);
        signSettings.setSaveOptions(saveOptions);
        CreateSignaturesRequest request = new CreateSignaturesRequest(signSettings);

        // Get and check result 
        SignResult response = signApi.createSignatures(request);
        CheckResponse(signSettings.getOptions(), response, testFile);

        //Download the signed file
        DownloadFile(signedFileName);
    }

    @Test
    public void SignDigitalPresentations() throws ApiException
    {
        //Digital signature is not supported for Presentations.
    }

    @Test
    public void SignDigitalSpreadsheet() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.SpreadsheetStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\SpreadsheetDigitalSigned." + testFile.extension;

        SignDigitalOptions options = new SignDigitalOptions();
        PopulateOptions(options);
        options.setDocumentType(DocumentTypeEnum.SPREADSHEET);
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setOutputFilePath(signedFileName);
        SignSettings signSettings = new SignSettings();
        signSettings.setFileInfo(fileInfo);
        signSettings.addOptionsItem(options);
        signSettings.setSaveOptions(saveOptions);
        CreateSignaturesRequest request = new CreateSignaturesRequest(signSettings);

        // Get and check result 
        SignResult response = signApi.createSignatures(request);
        CheckResponse(signSettings.getOptions(), response, testFile);

        //Download the signed file
        DownloadFile(signedFileName);
    }

    @Test
    public void SignDigitalWordProcessing() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.WordProcessingStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\WordProcessingDigitalSigned." + testFile.extension;

        SignDigitalOptions options = new SignDigitalOptions();
        PopulateOptions(options);
        options.setDocumentType(DocumentTypeEnum.WORDPROCESSING);
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setOutputFilePath(signedFileName);
        SignSettings signSettings = new SignSettings();
        signSettings.setFileInfo(fileInfo);
        signSettings.addOptionsItem(options);
        signSettings.setSaveOptions(saveOptions);
        CreateSignaturesRequest request = new CreateSignaturesRequest(signSettings);

        // Get and check result 
        SignResult response = signApi.createSignatures(request);
        CheckResponse(signSettings.getOptions(), response, testFile);

        //Download the signed file
        DownloadFile(signedFileName);
    }
   
    public static void PopulateOptions(SignDigitalOptions options)
    {
        options.setSignatureType(SignatureTypeEnum.DIGITAL);

        // set signature properties
        options.setImageGuid("Additional\\signature_01.jpg");
        options.setCertificateGuid("Additional\\SherlockHolmes.pfx");
        options.setPassword("1234567890");

        // set signature position on a page
        options.setLeft(100);
        options.setTop(100);
        options.setWidth(200);
        options.setHeight(200);
        options.setLocationMeasureType(LocationMeasureTypeEnum.PIXELS);
        options.setSizeMeasureType(SizeMeasureTypeEnum.PIXELS);
        options.setRotationAngle(0);
        options.setHorizontalAlignment(HorizontalAlignmentEnum.NONE);
        options.setVerticalAlignment(VerticalAlignmentEnum.NONE);
        Padding padding = new Padding();
        padding.setAll(5);
        options.setMargin(padding);
        options.setMarginMeasureType(MarginMeasureTypeEnum.PIXELS);

        // set signature appearance
        options.setOpacity(0.8);

        //set pages for signing (each of these page settings could be used singly)
        options.setPage(1);
        options.setAllPages(true);
        PagesSetup pagesSetup = new PagesSetup();
        pagesSetup.setEvenPages(false);
        pagesSetup.setFirstPage(true);
        pagesSetup.setLastPage(false);
        pagesSetup.setOddPages(false);
        pagesSetup.addPageNumbersItem(1);
        options.setPagesSetup(pagesSetup);
    }

    protected void CheckResponse(List<SignOptions> SignOptions, SignResult result, TestFile testFile)
    {
        assertNotNull("Result is empty.", result);
        assertNotNull("FileInfo is null.", result.getFileInfo());
        assertNotNull("FileInfo FilePath is empty.", result.getFileInfo().getFilePath());
        assertNotEquals("FileInfo FilePath is wrong.", testFile.getPath(), result.getFileInfo().getFilePath());
    }

}  