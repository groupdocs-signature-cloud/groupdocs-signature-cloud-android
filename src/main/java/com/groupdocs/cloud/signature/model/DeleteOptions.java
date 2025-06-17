/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DeleteOptions.java">
 *   Copyright (c) Aspose Pty Ltd
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

package com.groupdocs.cloud.signature.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Base container class for delete signature options
 */
@ApiModel(description = "Base container class for delete signature options")
public class DeleteOptions {
  /**
   * Specifies the type of signature
   */
  @JsonAdapter(SignatureTypeEnum.Adapter.class)
  public enum SignatureTypeEnum {
    NONE("None"),
    
    TEXT("Text"),
    
    IMAGE("Image"),
    
    DIGITAL("Digital"),
    
    BARCODE("Barcode"),
    
    QRCODE("QRCode"),
    
    STAMP("Stamp"),
    
    FORMFIELD("FormField"),
    
    METADATA("Metadata");

    private String value;

    SignatureTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignatureTypeEnum fromValue(String text) {
      for (SignatureTypeEnum b : SignatureTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SignatureTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignatureTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignatureTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SignatureTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("signatureType")
  private SignatureTypeEnum signatureType = null;

  @SerializedName("signatureId")
  private String signatureId = null;

  public DeleteOptions signatureType(SignatureTypeEnum signatureType) {
    this.signatureType = signatureType;
    return this;
  }

   /**
   * Specifies the type of signature
   * @return signatureType
  **/
  @ApiModelProperty(required = true, value = "Specifies the type of signature")
  public SignatureTypeEnum getSignatureType() {
    return signatureType;
  }

  public void setSignatureType(SignatureTypeEnum signatureType) {
    this.signatureType = signatureType;
  }

  public DeleteOptions signatureId(String signatureId) {
    this.signatureId = signatureId;
    return this;
  }

   /**
   * Unique signature identifier to modify signature in the document over Update or Delete methods. This property will be set automatically after Sign or Search method being called. If this property was saved before it can be set manually to manipulate the signature.              
   * @return signatureId
  **/
  @ApiModelProperty(value = "Unique signature identifier to modify signature in the document over Update or Delete methods. This property will be set automatically after Sign or Search method being called. If this property was saved before it can be set manually to manipulate the signature.              ")
  public String getSignatureId() {
    return signatureId;
  }

  public void setSignatureId(String signatureId) {
    this.signatureId = signatureId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteOptions deleteOptions = (DeleteOptions) o;
    return Objects.equals(this.signatureType, deleteOptions.signatureType) &&
        Objects.equals(this.signatureId, deleteOptions.signatureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureType, signatureId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteOptions {\n");
    
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

