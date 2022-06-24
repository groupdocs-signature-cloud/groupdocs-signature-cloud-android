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

package com.groupdocs.cloud.signature.api.sign;

import com.groupdocs.cloud.signature.api.*;
import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.OptionsBase.SignatureTypeEnum;
import com.groupdocs.cloud.signature.model.SignImageOptions.*;
import com.groupdocs.cloud.signature.model.requests.*;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class TestsSignStamp extends BaseApiTest {

    @Test
    public void SignStampImage() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.ImageStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\ImageStampSigned." + testFile.extension;

        SignStampOptions options = new SignStampOptions();
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
    public void SignStampPdf() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PdfStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\PdfStampSigned." + testFile.extension;

        SignStampOptions options = new SignStampOptions();
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
    public void SignStampPresentation() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PresentationStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\PresentationStampSigned." + testFile.extension;

        SignStampOptions options = new SignStampOptions();
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
    public void SignStampSpreadsheet() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.SpreadsheetStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\SpreadsheetStampSigned." + testFile.extension;

        SignStampOptions options = new SignStampOptions();
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
    public void SignStampWordProcessing() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.WordProcessingStorage.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        String signedFileName = "Output\\WordProcessingStampSigned." + testFile.extension;

        SignStampOptions options = new SignStampOptions();
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
   
    public static void PopulateOptions(SignStampOptions options)
    {
        options.setSignatureType(SignatureTypeEnum.STAMP);

        Color cornflowerBlueColor = new Color();
        cornflowerBlueColor.setWeb("CornflowerBlue");
        Color goldColor = new Color();
        goldColor.setWeb("Gold");
        Color blueVioletColor = new Color();
        blueVioletColor.setWeb("BlueViolet");
        Color darkOrangeColor = new Color();
        darkOrangeColor.setWeb("DarkOrange");
        Color oliveDrabColor = new Color();
        oliveDrabColor.setWeb("OliveDrab");
        Color ghostWhiteColor = new Color();
        ghostWhiteColor.setWeb("GhostWhite");

        // set signature properties
        options.setImageFilePath("Additional\\JohnSmithSign.png");

        // set signature position on a page
        options.setLeft(100);
        options.setTop(100);
        options.setWidth(300);
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
        options.setBackgroundColor(cornflowerBlueColor);
        options.setBackgroundColorCropType(SignStampOptions.BackgroundColorCropTypeEnum.INNERAREA);
        options.setBackgroundImageCropType(SignStampOptions.BackgroundImageCropTypeEnum.MIDDLEAREA);
        options.setTransparency(0.8);

        //Outer line
        StampLine outerLine = new StampLine();
        outerLine.setText("John Smith");
        SignatureFont outerLineFont = new SignatureFont();
        outerLineFont.setFontFamily("Arial");
        outerLineFont.setFontSize(12.0);
        outerLineFont.setBold(true);
        outerLineFont.setItalic(true);
        outerLineFont.setUnderline(true);
        outerLine.setFont(outerLineFont);
        outerLine.setTextBottomIntent(5);
        outerLine.setTextColor(goldColor);
        outerLine.setTextRepeatType(StampLine.TextRepeatTypeEnum.FULLTEXTREPEAT);
        outerLine.setBackgroundColor(blueVioletColor);
        outerLine.setHeight(20);

        BorderLine outerLineInnerBorder = new BorderLine();
        outerLineInnerBorder.setColor(darkOrangeColor);
        outerLineInnerBorder.setStyle(BorderLine.StyleEnum.LONGDASH);
        outerLineInnerBorder.setTransparency(0.5);
        outerLineInnerBorder.setWeight(1.2);
        outerLine.setInnerBorder(outerLineInnerBorder);

        BorderLine outerLineOuterBorder = new BorderLine();
        outerLineOuterBorder.setColor(darkOrangeColor);
        outerLineOuterBorder.setStyle(BorderLine.StyleEnum.LONGDASHDOT);
        outerLineOuterBorder.setTransparency(0.7);
        outerLineOuterBorder.setWeight(1.4);
        outerLine.setOuterBorder(outerLineOuterBorder);

        outerLine.setVisible(true);
        options.addOuterLinesItem(outerLine);

        //Inner line
        StampLine innerLine = new StampLine();
        innerLine.setText("John Smith");
        SignatureFont innerLineFont = new SignatureFont();
        innerLineFont.setFontFamily("Times New Roman");
        innerLineFont.setFontSize(20.0);
        innerLineFont.setBold(true);
        innerLineFont.setItalic(true);
        innerLineFont.setUnderline(true);
        innerLine.setFont(innerLineFont);
        innerLine.setTextBottomIntent(3);
        innerLine.setTextColor(goldColor);
        innerLine.setTextRepeatType(StampLine.TextRepeatTypeEnum.NONE);
        innerLine.setBackgroundColor(cornflowerBlueColor);
        innerLine.setHeight(30);

        BorderLine innerLineInnerBorder = new BorderLine();
        innerLineInnerBorder.setColor(oliveDrabColor);
        innerLineInnerBorder.setStyle(BorderLine.StyleEnum.LONGDASH);
        innerLineInnerBorder.setTransparency(0.5);
        innerLineInnerBorder.setWeight(1.2);
        innerLine.setInnerBorder(innerLineInnerBorder);

        BorderLine innerLineOuterBorder = new BorderLine();
        innerLineOuterBorder.setColor(ghostWhiteColor);
        innerLineOuterBorder.setStyle(BorderLine.StyleEnum.DOT);
        innerLineOuterBorder.setTransparency(0.4);
        innerLineOuterBorder.setWeight(1.4);
        innerLine.setOuterBorder(innerLineOuterBorder);

        innerLine.setVisible(true);
        options.addInnerLinesItem(innerLine);

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