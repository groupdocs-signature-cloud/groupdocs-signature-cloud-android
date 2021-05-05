/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="UpdateOptions.java">
 *   Copyright (c) 2003-2021 Aspose Pty Ltd
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
 * Base container class for update signature options
 */
@ApiModel(description = "Base container class for update signature options")
public class UpdateOptions {
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
    
    STAMP("Stamp");

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

  @SerializedName("left")
  private Integer left = null;

  @SerializedName("top")
  private Integer top = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("isSignature")
  private Boolean isSignature = null;

  @SerializedName("text")
  private String text = null;

  public UpdateOptions signatureType(SignatureTypeEnum signatureType) {
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

  public UpdateOptions signatureId(String signatureId) {
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

  public UpdateOptions left(Integer left) {
    this.left = left;
    return this;
  }

   /**
   * Specifies left position of signature
   * @return left
  **/
  @ApiModelProperty(required = true, value = "Specifies left position of signature")
  public Integer getLeft() {
    return left;
  }

  public void setLeft(Integer left) {
    this.left = left;
  }

  public UpdateOptions top(Integer top) {
    this.top = top;
    return this;
  }

   /**
   * Specifies top position of signature
   * @return top
  **/
  @ApiModelProperty(required = true, value = "Specifies top position of signature")
  public Integer getTop() {
    return top;
  }

  public void setTop(Integer top) {
    this.top = top;
  }

  public UpdateOptions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Specifies width of signature
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Specifies width of signature")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public UpdateOptions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Specifies height of signature
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Specifies height of signature")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public UpdateOptions isSignature(Boolean isSignature) {
    this.isSignature = isSignature;
    return this;
  }

   /**
   * Get or set flag to indicate if this component is Signature or document content. This property is being used with Update method to set element as signature (true) or document element (false).             
   * @return isSignature
  **/
  @ApiModelProperty(required = true, value = "Get or set flag to indicate if this component is Signature or document content. This property is being used with Update method to set element as signature (true) or document element (false).             ")
  public Boolean getIsSignature() {
    return isSignature;
  }

  public void setIsSignature(Boolean isSignature) {
    this.isSignature = isSignature;
  }

  public UpdateOptions text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text to update text signature
   * @return text
  **/
  @ApiModelProperty(value = "The text to update text signature")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOptions updateOptions = (UpdateOptions) o;
    return Objects.equals(this.signatureType, updateOptions.signatureType) &&
        Objects.equals(this.signatureId, updateOptions.signatureId) &&
        Objects.equals(this.left, updateOptions.left) &&
        Objects.equals(this.top, updateOptions.top) &&
        Objects.equals(this.width, updateOptions.width) &&
        Objects.equals(this.height, updateOptions.height) &&
        Objects.equals(this.isSignature, updateOptions.isSignature) &&
        Objects.equals(this.text, updateOptions.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureType, signatureId, left, top, width, height, isSignature, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOptions {\n");
    
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    isSignature: ").append(toIndentedString(isSignature)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

