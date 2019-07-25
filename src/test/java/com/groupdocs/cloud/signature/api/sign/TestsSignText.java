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
import com.groupdocs.cloud.signature.model.SignTextOptions.BorderDashStyleEnum;
import com.groupdocs.cloud.signature.model.SignTextOptions.HorizontalAlignmentEnum;
import com.groupdocs.cloud.signature.model.SignTextOptions.LocationMeasureTypeEnum;
import com.groupdocs.cloud.signature.model.SignTextOptions.MarginMeasureTypeEnum;
import com.groupdocs.cloud.signature.model.SignTextOptions.SizeMeasureTypeEnum;
import com.groupdocs.cloud.signature.model.SignTextOptions.StretchEnum;
import com.groupdocs.cloud.signature.model.SignTextOptions.VerticalAlignmentEnum;
import com.groupdocs.cloud.signature.model.requests.*;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class TestsSignText extends BaseApiTest {

    @Test
    public void SignTextImage() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.ImageStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\ImageTextSigned." + testFile.extension;

        SignTextOptions options = new SignTextOptions();
        PopulateOptions(options);
        options.setDocumentType(DocumentTypeEnum.IMAGE);
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
    public void SignTextPdf() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PdfStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\PdfTextSigned." + testFile.extension;

        SignTextOptions options = new SignTextOptions();
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
    public void SignTextPresentation() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PresentationStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\PresentationTextSigned." + testFile.extension;

        SignTextOptions options = new SignTextOptions();
        PopulateOptions(options);
        options.setDocumentType(DocumentTypeEnum.PRESENTATION);
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
    public void SignTextSpreadsheet() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.SpreadsheetStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\SpreadsheetTextSigned." + testFile.extension;

        SignTextOptions options = new SignTextOptions();
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
    public void SignTextWordProcessing() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.WordProcessingStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\WordProcessingTextSigned." + testFile.extension;

        SignTextOptions options = new SignTextOptions();
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
   
    public static void PopulateOptions(SignTextOptions options)
    {
        options.setSignatureType(SignatureTypeEnum.TEXT);

        // set signature properties
        options.setText("John Smith");

        // set signature position on a page
        options.setLeft(100);
        options.setTop(100);
        options.setWidth(100);
        options.setHeight(100);
        options.setLocationMeasureType(LocationMeasureTypeEnum.PIXELS);
        options.setSizeMeasureType(SizeMeasureTypeEnum.PIXELS);
        options.setStretch(StretchEnum.NONE);
        options.setRotationAngle(0);
        options.setHorizontalAlignment(HorizontalAlignmentEnum.NONE);
        options.setVerticalAlignment(VerticalAlignmentEnum.NONE);
        Padding padding = new Padding();
        padding.setAll(5);
        options.setMargin(padding);
        options.setMarginMeasureType(MarginMeasureTypeEnum.PIXELS);

        // set signature appearance
        Color foreColor = new Color();
        foreColor.setWeb("BlueViolet");
        options.setForeColor(foreColor);
        Color borderColor = new Color();
        borderColor.setWeb("DarkOrange");
        options.setBorderColor(borderColor);
        Color backgroundColor = new Color();
        backgroundColor.setWeb("DarkOrange");
        options.setBackgroundColor(backgroundColor);
        options.setBorderVisiblity(true);
        options.setBorderDashStyle(BorderDashStyleEnum.DASH);

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