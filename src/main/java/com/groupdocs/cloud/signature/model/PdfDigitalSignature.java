/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfDigitalSignature.java">
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

package com.groupdocs.cloud.signature.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.signature.model.TimeStamp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains pdf digital Signature properties
 */
@ApiModel(description = "Contains pdf digital Signature properties")
public class PdfDigitalSignature {
  @SerializedName("contactInfo")
  private String contactInfo = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("reason")
  private String reason = null;

  /**
   * Type of Pdf digital signature.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SIGNATURE("Signature"),
    
    CERTIFICATE("Certificate");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("timeStamp")
  private TimeStamp timeStamp = null;

  @SerializedName("showProperties")
  private Boolean showProperties = null;

  public PdfDigitalSignature contactInfo(String contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

   /**
   * Information provided by the signer to enable a recipient to contact the signer
   * @return contactInfo
  **/
  @ApiModelProperty(value = "Information provided by the signer to enable a recipient to contact the signer")
  public String getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(String contactInfo) {
    this.contactInfo = contactInfo;
  }

  public PdfDigitalSignature location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The CPU host name or physical location of the signing.
   * @return location
  **/
  @ApiModelProperty(value = "The CPU host name or physical location of the signing.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public PdfDigitalSignature reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason for the signing, such as (I agreeРІР‚В¦).
   * @return reason
  **/
  @ApiModelProperty(value = "The reason for the signing, such as (I agreeРІР‚В¦).")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PdfDigitalSignature type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of Pdf digital signature.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of Pdf digital signature.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PdfDigitalSignature timeStamp(TimeStamp timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Time stamp for Pdf digital signature. Default value is null.
   * @return timeStamp
  **/
  @ApiModelProperty(required = true, value = "Time stamp for Pdf digital signature. Default value is null.")
  public TimeStamp getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(TimeStamp timeStamp) {
    this.timeStamp = timeStamp;
  }

  public PdfDigitalSignature showProperties(Boolean showProperties) {
    this.showProperties = showProperties;
    return this;
  }

   /**
   * Force to show/hide signature properties
   * @return showProperties
  **/
  @ApiModelProperty(required = true, value = "Force to show/hide signature properties")
  public Boolean getShowProperties() {
    return showProperties;
  }

  public void setShowProperties(Boolean showProperties) {
    this.showProperties = showProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfDigitalSignature pdfDigitalSignature = (PdfDigitalSignature) o;
    return Objects.equals(this.contactInfo, pdfDigitalSignature.contactInfo) &&
        Objects.equals(this.location, pdfDigitalSignature.location) &&
        Objects.equals(this.reason, pdfDigitalSignature.reason) &&
        Objects.equals(this.type, pdfDigitalSignature.type) &&
        Objects.equals(this.timeStamp, pdfDigitalSignature.timeStamp) &&
        Objects.equals(this.showProperties, pdfDigitalSignature.showProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactInfo, location, reason, type, timeStamp, showProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfDigitalSignature {\n");
    
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    showProperties: ").append(toIndentedString(showProperties)).append("\n");
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

