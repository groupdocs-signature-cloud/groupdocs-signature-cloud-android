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

package com.groupdocs.cloud.signature.api.search;

import com.groupdocs.cloud.signature.api.*;
import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.model.OptionsBase.SignatureTypeEnum;
import com.groupdocs.cloud.signature.model.requests.*;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class TestsSearchDigital extends BaseApiTest {

    @Test
    public void SearchDigitalImage() throws ApiException
    {
        // Digital search is not supported for images
    }

    @Test
    public void SearchDigitalPdf() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.PdfStorageSigned.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        SearchDigitalOptions options = new SearchDigitalOptions();
        PopulateOptions(options);
        SearchSettings searchSettings = new SearchSettings();
        searchSettings.setFileInfo(fileInfo);
        searchSettings.addOptionsItem(options);
        SearchSignaturesRequest request = new SearchSignaturesRequest(searchSettings);

        // Get and check result 
        SearchResult response = signApi.searchSignatures(request);

        CheckResponse(searchSettings.getOptions(), response, testFile);
    }

    @Test
    public void SearchDigitalPresentation() throws ApiException
    {
        // Digital search is not supported for presentations
    }

    @Test
    public void SearchDigitalSpreadsheet() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.SpreadsheetStorageSigned.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        SearchDigitalOptions options = new SearchDigitalOptions();
        PopulateOptions(options);
        SearchSettings searchSettings = new SearchSettings();
        searchSettings.setFileInfo(fileInfo);
        searchSettings.addOptionsItem(options);
        SearchSignaturesRequest request = new SearchSignaturesRequest(searchSettings);

        // Get and check result 
        SearchResult response = signApi.searchSignatures(request);

        CheckResponse(searchSettings.getOptions(), response, testFile);
    }

    @Test
    public void SearchDigitalWordProcessing() throws ApiException
    {
        // Set request
        TestFile testFile = TestFiles.WordProcessingStorageSigned.get(0);
        FileInfo fileInfo = testFile.ToFileInfo();
        SearchDigitalOptions options = new SearchDigitalOptions();
        PopulateOptions(options);
        SearchSettings searchSettings = new SearchSettings();
        searchSettings.setFileInfo(fileInfo);
        searchSettings.addOptionsItem(options);
        SearchSignaturesRequest request = new SearchSignaturesRequest(searchSettings);

        // Get and check result 
        SearchResult response = signApi.searchSignatures(request);

        CheckResponse(searchSettings.getOptions(), response, testFile);
    }
   
    public static void PopulateOptions(SearchDigitalOptions options)
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

        options.setSignatureType(SignatureTypeEnum.DIGITAL);
    }

    protected void CheckResponse(List<SearchOptions> searchOptions, SearchResult result, TestFile testFile)
    {
        assertNotNull("Result is empty.", result);
        assertEquals("Wrong size.", result.getSize(), Long.valueOf(testFile.getSize()));
        assertNotNull("FileInfo is null.", result.getFileInfo());
        assertNotNull("FileInfo FilePath is empty.", result.getFileInfo().getFilePath());
        assertEquals("FileInfo FilePath is wrong.", testFile.getPath(), result.getFileInfo().getFilePath());
        assertNotNull("Signatures null", result.getSignatures());
        assertTrue("Signatures empty", result.getSignatures().size() > 0);
        for (SearchOptions option : searchOptions)
        {
            boolean exists = false;
            for (Signature signature : result.getSignatures())
            {
                DigitalSignature DigitalSignature = (DigitalSignature)signature;
                SearchDigitalOptions searchDigitalOptions = (SearchDigitalOptions)option;

                if (DigitalSignature != null &&
                    DigitalSignature.getSignatureType().toString().equals(searchDigitalOptions.getSignatureType().toString()))
                {
                    exists = true;
                    break;
                }
            }
            assertTrue("Signature type "+option.getSignatureType()+" is not found", exists);
        }
    }

}  