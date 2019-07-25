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

package com.groupdocs.cloud.signature.api.getinfo;

import static org.junit.Assert.*;

import com.groupdocs.cloud.signature.api.*;
import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.*;

import org.junit.Test;

public class TestSignatureGetFormats extends BaseApiTest {

    @Test
    public void GetSupportedFileFormats() throws ApiException
    {
        FormatsResult response = infoApi.getSupportedFileFormats();
        
        assertTrue("Count", response.getFormats().size() > 0);

        for (Format item : response.getFormats())
        {
            assertNotNull(item.getExtension());
            assertNotSame("", item.getExtension());

            assertNotNull(item.getFileFormat());
            assertNotSame("", item.getFileFormat());
        }
    }

    @Test
    public void GetSupportedBarcodeFormats() throws ApiException
    {
        BarcodesResult response = infoApi.getSupportedBarcodes();

        assertTrue("Count", response.getBarcodeTypes().size() > 0);

        for (BarcodeType item : response.getBarcodeTypes())
        {
            assertNotNull(item.getName());
            assertNotSame("", item.getName());
        }
    }

    @Test
    public void GetSupportedQRCodeFormats() throws ApiException
    {
        QRCodesResult response = infoApi.getSupportedQRCodes();

        assertTrue("Count", response.getQrCodeTypes().size() > 0);

        for (QRCodeType item : response.getQrCodeTypes())
        {
            assertNotNull(item.getName());
            assertNotSame("", item.getName());
        }
    }
   
}  