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

package com.groupdocs.cloud.signature.api.sign;

import com.groupdocs.cloud.signature.api.*;
import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.OptionsBase.SignatureTypeEnum;
import com.groupdocs.cloud.signature.model.SignQRCodeOptions.CodeTextAlignmentEnum;
import com.groupdocs.cloud.signature.model.SignTextOptions.*;
import com.groupdocs.cloud.signature.model.BorderLine.*;
import com.groupdocs.cloud.signature.model.requests.*;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class TestsSignQRCode extends BaseApiTest {

    @Test
    public void SignQRCodeImage() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.ImageStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\ImageQRCodeSigned." + testFile.extension;

        SignQRCodeOptions options = new SignQRCodeOptions();
        PopulateOptions(options);
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
    public void SignQRCodePdf() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PdfStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\PdfQRCodeSigned." + testFile.extension;

        SignQRCodeOptions options = new SignQRCodeOptions();
        PopulateOptions(options);
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
    public void SignQRCodePresentation() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PresentationStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\PresentationQRCodeSigned." + testFile.extension;

        SignQRCodeOptions options = new SignQRCodeOptions();
        PopulateOptions(options);
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
    public void SignQRCodeSpreadsheet() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.SpreadsheetStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\SpreadsheetQRCodeSigned." + testFile.extension;

        SignQRCodeOptions options = new SignQRCodeOptions();
        PopulateOptions(options);
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
    public void SignQRCodeWordProcessing() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.WordProcessingStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\WordProcessingQRCodeSigned." + testFile.extension;

        SignQRCodeOptions options = new SignQRCodeOptions();
        PopulateOptions(options);
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
   
    public static void PopulateOptions(SignQRCodeOptions options)
    {
        options.setSignatureType(SignatureTypeEnum.QRCODE);

        // set signature properties
        options.setText("John Smit");
        options.setQrCodeType("Aztec");
        options.setCodeTextAlignment(CodeTextAlignmentEnum.NONE);

        // set signature position on a page
        options.setLeft(100);
        options.setTop(100);
        options.setWidth(200);
        options.setHeight(200);
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

        BorderLine border = new BorderLine();
        border.setColor(borderColor);
        border.setVisible(true);
        border.setStyle(StyleEnum.DASH);
        border.setWeight(12.0);
        options.setBorder(border);

        Color backgroundColor = new Color();
        backgroundColor.setWeb("DarkOrange");
        options.setBackgroundColor(backgroundColor);
        options.setTransparency(0.8);
        Padding innerMargins = new Padding();
        innerMargins.setAll(2);
        options.setInnerMargins(innerMargins);

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