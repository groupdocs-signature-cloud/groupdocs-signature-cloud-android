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

package com.groupdocs.cloud.signature.api.sign;

import com.groupdocs.cloud.signature.api.*;
import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.requests.*;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class TestsSignCollection extends BaseApiTest {

    @Test
    public void SignCollectionImage() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.ImageStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\ImageCollectionSigned." + testFile.extension;

        SignBarcodeOptions barcodeOptions = new SignBarcodeOptions();
        TestsSignBarcode.PopulateOptions(barcodeOptions);
        barcodeOptions.setTop(0);

        //Digital signature is not supported for Images.

        SignImageOptions imageOptions = new SignImageOptions();
        TestsSignImage.PopulateOptions(imageOptions);
        imageOptions.setTop(barcodeOptions.getTop() + barcodeOptions.getHeight() + 20);

        SignQRCodeOptions qrCodeOptions = new SignQRCodeOptions();
        TestsSignQRCode.PopulateOptions(qrCodeOptions);
        qrCodeOptions.setTop(imageOptions.getTop() + imageOptions.getHeight() + 20);

        SignStampOptions stampOptions = new SignStampOptions();
        TestsSignStamp.PopulateOptions(stampOptions);
        stampOptions.setTop(qrCodeOptions.getTop() + qrCodeOptions.getHeight() + 20);

        SignTextOptions textOptions = new SignTextOptions();
        TestsSignText.PopulateOptions(textOptions);
        textOptions.setTop(stampOptions.getTop() + stampOptions.getHeight() + 20);

        SignSettings signSettings = new SignSettings();
        signSettings.setFileInfo(fileInfo);
        signSettings.addOptionsItem(barcodeOptions);
        signSettings.addOptionsItem(imageOptions);
        signSettings.addOptionsItem(qrCodeOptions);
        signSettings.addOptionsItem(stampOptions);
        signSettings.addOptionsItem(textOptions);
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setOutputFilePath(signedFileName);
        signSettings.setSaveOptions(saveOptions);
        CreateSignaturesRequest request = new CreateSignaturesRequest(signSettings);

        // Get and check result 
        SignResult response = signApi.createSignatures(request);

        CheckResponse(signSettings.getOptions(), response, testFile);
        
        //Download the signed file
        DownloadFile(signedFileName);
    }

    @Test
    public void SignCollectionPdf() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PdfStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\PdfCollectionSigned." + testFile.extension;

        SignBarcodeOptions barcodeOptions = new SignBarcodeOptions();
        TestsSignBarcode.PopulateOptions(barcodeOptions);
        barcodeOptions.setTop(0);

        SignDigitalOptions digitalOptions = new SignDigitalOptions();
        TestsSignDigital.PopulateOptions(digitalOptions);
        digitalOptions.setTop(barcodeOptions.getTop() + barcodeOptions.getHeight() + 20);

        SignImageOptions imageOptions = new SignImageOptions();
        TestsSignImage.PopulateOptions(imageOptions);
        imageOptions.setTop(digitalOptions.getTop() + digitalOptions.getHeight() + 20);

        SignQRCodeOptions qrCodeOptions = new SignQRCodeOptions();
        TestsSignQRCode.PopulateOptions(qrCodeOptions);
        qrCodeOptions.setTop(imageOptions.getTop() + imageOptions.getHeight() + 20);

        SignStampOptions stampOptions = new SignStampOptions();
        TestsSignStamp.PopulateOptions(stampOptions);
        stampOptions.setTop(qrCodeOptions.getTop() + qrCodeOptions.getHeight() + 20);

        SignTextOptions textOptions = new SignTextOptions();
        TestsSignText.PopulateOptions(textOptions);
        textOptions.setTop(stampOptions.getTop() + stampOptions.getHeight() + 20);

        SignSettings signSettings = new SignSettings();
        signSettings.setFileInfo(fileInfo);
        signSettings.addOptionsItem(barcodeOptions);
        signSettings.addOptionsItem(digitalOptions);
        signSettings.addOptionsItem(imageOptions);
        signSettings.addOptionsItem(qrCodeOptions);
        signSettings.addOptionsItem(stampOptions);
        signSettings.addOptionsItem(textOptions);
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setOutputFilePath(signedFileName);
        signSettings.setSaveOptions(saveOptions);
        CreateSignaturesRequest request = new CreateSignaturesRequest(signSettings);

        // Get and check result 
        SignResult response = signApi.createSignatures(request);

        CheckResponse(signSettings.getOptions(), response, testFile);
        
        //Download the signed file
        DownloadFile(signedFileName);
    }

    @Test
    public void SignCollectionPresentation() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PresentationStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\PresentationCollectionSigned." + testFile.extension;

        SignBarcodeOptions barcodeOptions = new SignBarcodeOptions();
        TestsSignBarcode.PopulateOptions(barcodeOptions);
        barcodeOptions.setTop(0);

        //Digital signature is not supported for Presentations.

        SignImageOptions imageOptions = new SignImageOptions();
        TestsSignImage.PopulateOptions(imageOptions);
        imageOptions.setTop(barcodeOptions.getTop() + barcodeOptions.getHeight() + 20);

        SignQRCodeOptions qrCodeOptions = new SignQRCodeOptions();
        TestsSignQRCode.PopulateOptions(qrCodeOptions);
        qrCodeOptions.setTop(imageOptions.getTop() + imageOptions.getHeight() + 20);

        SignStampOptions stampOptions = new SignStampOptions();
        TestsSignStamp.PopulateOptions(stampOptions);
        stampOptions.setTop(qrCodeOptions.getTop() + qrCodeOptions.getHeight() + 20);

        SignTextOptions textOptions = new SignTextOptions();
        TestsSignText.PopulateOptions(textOptions);
        textOptions.setTop(stampOptions.getTop() + stampOptions.getHeight() + 20);

        SignSettings signSettings = new SignSettings();
        signSettings.setFileInfo(fileInfo);
        signSettings.addOptionsItem(barcodeOptions);
        signSettings.addOptionsItem(imageOptions);
        signSettings.addOptionsItem(qrCodeOptions);
        signSettings.addOptionsItem(stampOptions);
        signSettings.addOptionsItem(textOptions);
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setOutputFilePath(signedFileName);
        signSettings.setSaveOptions(saveOptions);
        CreateSignaturesRequest request = new CreateSignaturesRequest(signSettings);

        // Get and check result 
        SignResult response = signApi.createSignatures(request);

        CheckResponse(signSettings.getOptions(), response, testFile);
        
        //Download the signed file
        DownloadFile(signedFileName);
    }

    @Test
    public void SignCollectionSpreadsheet() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.SpreadsheetStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\SpreadsheetCollectionSigned." + testFile.extension;

        SignBarcodeOptions barcodeOptions = new SignBarcodeOptions();
        TestsSignBarcode.PopulateOptions(barcodeOptions);
        barcodeOptions.setTop(0);

        SignDigitalOptions digitalOptions = new SignDigitalOptions();
        TestsSignDigital.PopulateOptions(digitalOptions);
        digitalOptions.setTop(barcodeOptions.getTop() + barcodeOptions.getHeight() + 20);

        SignImageOptions imageOptions = new SignImageOptions();
        TestsSignImage.PopulateOptions(imageOptions);
        imageOptions.setTop(digitalOptions.getTop() + digitalOptions.getHeight() + 20);

        SignQRCodeOptions qrCodeOptions = new SignQRCodeOptions();
        TestsSignQRCode.PopulateOptions(qrCodeOptions);
        qrCodeOptions.setTop(imageOptions.getTop() + imageOptions.getHeight() + 20);

        SignStampOptions stampOptions = new SignStampOptions();
        TestsSignStamp.PopulateOptions(stampOptions);
        stampOptions.setTop(qrCodeOptions.getTop() + qrCodeOptions.getHeight() + 20);

        SignTextOptions textOptions = new SignTextOptions();
        TestsSignText.PopulateOptions(textOptions);
        textOptions.setTop(stampOptions.getTop() + stampOptions.getHeight() + 20);

        SignSettings signSettings = new SignSettings();
        signSettings.setFileInfo(fileInfo);
        signSettings.addOptionsItem(barcodeOptions);
        signSettings.addOptionsItem(digitalOptions);
        signSettings.addOptionsItem(imageOptions);
        signSettings.addOptionsItem(qrCodeOptions);
        signSettings.addOptionsItem(stampOptions);
        signSettings.addOptionsItem(textOptions);
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setOutputFilePath(signedFileName);
        signSettings.setSaveOptions(saveOptions);
        CreateSignaturesRequest request = new CreateSignaturesRequest(signSettings);

        // Get and check result 
        SignResult response = signApi.createSignatures(request);

        CheckResponse(signSettings.getOptions(), response, testFile);
        
        //Download the signed file
        DownloadFile(signedFileName);
    }

    @Test
    public void SignCollectionWordProcessing() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.WordProcessingStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\WordProcessingCollectionSigned." + testFile.extension;

        SignBarcodeOptions barcodeOptions = new SignBarcodeOptions();
        TestsSignBarcode.PopulateOptions(barcodeOptions);
        barcodeOptions.setTop(0);

        SignDigitalOptions digitalOptions = new SignDigitalOptions();
        TestsSignDigital.PopulateOptions(digitalOptions);
        digitalOptions.setTop(barcodeOptions.getTop() + barcodeOptions.getHeight() + 20);

        SignImageOptions imageOptions = new SignImageOptions();
        TestsSignImage.PopulateOptions(imageOptions);
        imageOptions.setTop(digitalOptions.getTop() + digitalOptions.getHeight() + 20);

        SignQRCodeOptions qrCodeOptions = new SignQRCodeOptions();
        TestsSignQRCode.PopulateOptions(qrCodeOptions);
        qrCodeOptions.setTop(imageOptions.getTop() + imageOptions.getHeight() + 20);

        SignStampOptions stampOptions = new SignStampOptions();
        TestsSignStamp.PopulateOptions(stampOptions);
        stampOptions.setTop(qrCodeOptions.getTop() + qrCodeOptions.getHeight() + 20);

        SignTextOptions textOptions = new SignTextOptions();
        TestsSignText.PopulateOptions(textOptions);
        textOptions.setTop(stampOptions.getTop() + stampOptions.getHeight() + 20);

        SignSettings signSettings = new SignSettings();
        signSettings.setFileInfo(fileInfo);
        signSettings.addOptionsItem(barcodeOptions);
        signSettings.addOptionsItem(digitalOptions);
        signSettings.addOptionsItem(imageOptions);
        signSettings.addOptionsItem(qrCodeOptions);
        signSettings.addOptionsItem(stampOptions);
        signSettings.addOptionsItem(textOptions);
        SaveOptions saveOptions = new SaveOptions();
        saveOptions.setOutputFilePath(signedFileName);
        signSettings.setSaveOptions(saveOptions);
        CreateSignaturesRequest request = new CreateSignaturesRequest(signSettings);

        // Get and check result 
        SignResult response = signApi.createSignatures(request);

        CheckResponse(signSettings.getOptions(), response, testFile);
        
        //Download the signed file
        DownloadFile(signedFileName);
    }
   
    protected void CheckResponse(List<SignOptions> SignOptions, SignResult result, TestFile testFile)
    {
        assertNotNull("Result is empty.", result);
        assertNotNull("FileInfo is null.", result.getFileInfo());
        assertNotNull("FileInfo FilePath is empty.", result.getFileInfo().getFilePath());
        assertNotEquals("FileInfo FilePath is wrong.", testFile.getPath(), result.getFileInfo().getFilePath());
    }

}  