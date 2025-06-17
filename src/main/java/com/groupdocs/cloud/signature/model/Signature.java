/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Signature.java">
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
import org.threeten.bp.OffsetDateTime;

/**
 * Describes base class for signatures
 */
@ApiModel(description = "Describes base class for signatures")
public class Signature {
  /**
   * Specifies the signature type (Text, Image, Digital, Barcode, QRCode, Stamp)
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

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("signatureId")
  private String signatureId = null;

  @SerializedName("isSignature")
  private Boolean isSignature = null;

  @SerializedName("createdOn")
  private OffsetDateTime createdOn = null;

  @SerializedName("modifiedOn")
  private OffsetDateTime modifiedOn = null;

  @SerializedName("top")
  private Integer top = null;

  @SerializedName("left")
  private Integer left = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  public Signature signatureType(SignatureTypeEnum signatureType) {
    this.signatureType = signatureType;
    return this;
  }

   /**
   * Specifies the signature type (Text, Image, Digital, Barcode, QRCode, Stamp)
   * @return signatureType
  **/
  @ApiModelProperty(required = true, value = "Specifies the signature type (Text, Image, Digital, Barcode, QRCode, Stamp)")
  public SignatureTypeEnum getSignatureType() {
    return signatureType;
  }

  public void setSignatureType(SignatureTypeEnum signatureType) {
    this.signatureType = signatureType;
  }

  public Signature pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Specifies the page signature was found on
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Specifies the page signature was found on")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Signature signatureId(String signatureId) {
    this.signatureId = signatureId;
    return this;
  }

   /**
   * Unique signature identifier to modify signature in the document over Update or Delete methods. This property will be set automatically after Sign or Search method being called. If this property was saved before it can be set manually to manipulate the signature.
   * @return signatureId
  **/
  @ApiModelProperty(value = "Unique signature identifier to modify signature in the document over Update or Delete methods. This property will be set automatically after Sign or Search method being called. If this property was saved before it can be set manually to manipulate the signature.")
  public String getSignatureId() {
    return signatureId;
  }

  public void setSignatureId(String signatureId) {
    this.signatureId = signatureId;
  }

  public Signature isSignature(Boolean isSignature) {
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

  public Signature createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get or set the signature creation date
   * @return createdOn
  **/
  @ApiModelProperty(required = true, value = "Get or set the signature creation date")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public Signature modifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Get or set the signature modification date
   * @return modifiedOn
  **/
  @ApiModelProperty(required = true, value = "Get or set the signature modification date")
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public Signature top(Integer top) {
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

  public Signature left(Integer left) {
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

  public Signature width(Integer width) {
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

  public Signature height(Integer height) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Signature signature = (Signature) o;
    return Objects.equals(this.signatureType, signature.signatureType) &&
        Objects.equals(this.pageNumber, signature.pageNumber) &&
        Objects.equals(this.signatureId, signature.signatureId) &&
        Objects.equals(this.isSignature, signature.isSignature) &&
        Objects.equals(this.createdOn, signature.createdOn) &&
        Objects.equals(this.modifiedOn, signature.modifiedOn) &&
        Objects.equals(this.top, signature.top) &&
        Objects.equals(this.left, signature.left) &&
        Objects.equals(this.width, signature.width) &&
        Objects.equals(this.height, signature.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureType, pageNumber, signatureId, isSignature, createdOn, modifiedOn, top, left, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
    sb.append("    isSignature: ").append(toIndentedString(isSignature)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

