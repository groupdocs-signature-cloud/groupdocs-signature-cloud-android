/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SignatureDeserializer.java">
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
package com.groupdocs.cloud.signature.client;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.groupdocs.cloud.signature.model.*;

public class SignatureDeserializer implements JsonDeserializer<Signature>
{
    Gson gson;
    Map<String, Class<? extends Signature>> registry;

    SignatureDeserializer(Gson _gson)
    {
        registry = new HashMap<String, Class<? extends Signature>>();
        registry.put("Barcode", BarcodeSignature.class);
        registry.put("QRCode", QRCodeSignature.class);
        registry.put("Digital", DigitalSignature.class);
        registry.put("Image", ImageSignature.class);
        registry.put("Text", TextSignature.class);
        gson = _gson;
    }


    @Override
    public Signature deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException
    {
        JsonObject signatureObject = json.getAsJsonObject();
        JsonElement signatureTypeElement = signatureObject.get("signatureType");
        Class<? extends Signature> signatureInstanceClass = registry.get(signatureTypeElement.getAsString());
        if(signatureInstanceClass == null)
            signatureInstanceClass = Signature.class;
        return gson.fromJson(json, signatureInstanceClass);
    }
}