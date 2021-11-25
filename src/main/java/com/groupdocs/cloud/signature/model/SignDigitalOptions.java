/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SignDigitalOptions.java">
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
import com.groupdocs.cloud.signature.model.BorderLine;
import com.groupdocs.cloud.signature.model.Padding;
import com.groupdocs.cloud.signature.model.PagesSetup;
import com.groupdocs.cloud.signature.model.SignImageOptions;
import com.groupdocs.cloud.signature.model.SignatureAppearance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents the Digital sign options
 */
@ApiModel(description = "Represents the Digital sign options")
public class SignDigitalOptions extends SignImageOptions {
  @SerializedName("reason")
  private String reason = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("visible")
  private Boolean visible = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("certificateFilePath")
  private String certificateFilePath = null;

  /**
   * XAdES type GroupDocs.Signature.Options.DigitalSignOptions.XAdESType. Default value is None (XAdES is off). At this moment XAdES signature type is supported only for Spreadsheet documents.             
   */
  @JsonAdapter(XadESTypeEnum.Adapter.class)
  public enum XadESTypeEnum {
    NONE("None"),
    
    XADES("XAdES");

    private String value;

    XadESTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static XadESTypeEnum fromValue(String text) {
      for (XadESTypeEnum b : XadESTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<XadESTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final XadESTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public XadESTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return XadESTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("xadESType")
  private XadESTypeEnum xadESType = null;

  public SignDigitalOptions reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Gets or sets the reason of signature.
   * @return reason
  **/
  @ApiModelProperty(value = "Gets or sets the reason of signature.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public SignDigitalOptions contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Gets or sets the signature contact.
   * @return contact
  **/
  @ApiModelProperty(value = "Gets or sets the signature contact.")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public SignDigitalOptions location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Gets or sets the signature location.
   * @return location
  **/
  @ApiModelProperty(value = "Gets or sets the signature location.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public SignDigitalOptions visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Gets or sets the visibility of signature.
   * @return visible
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the visibility of signature.")
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public SignDigitalOptions password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Gets or sets the password of digital certificate
   * @return password
  **/
  @ApiModelProperty(value = "Gets or sets the password of digital certificate")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public SignDigitalOptions certificateFilePath(String certificateFilePath) {
    this.certificateFilePath = certificateFilePath;
    return this;
  }

   /**
   * Gets or sets the digital certificate file GUID
   * @return certificateFilePath
  **/
  @ApiModelProperty(value = "Gets or sets the digital certificate file GUID")
  public String getCertificateFilePath() {
    return certificateFilePath;
  }

  public void setCertificateFilePath(String certificateFilePath) {
    this.certificateFilePath = certificateFilePath;
  }

  public SignDigitalOptions xadESType(XadESTypeEnum xadESType) {
    this.xadESType = xadESType;
    return this;
  }

   /**
   * XAdES type GroupDocs.Signature.Options.DigitalSignOptions.XAdESType. Default value is None (XAdES is off). At this moment XAdES signature type is supported only for Spreadsheet documents.             
   * @return xadESType
  **/
  @ApiModelProperty(required = true, value = "XAdES type GroupDocs.Signature.Options.DigitalSignOptions.XAdESType. Default value is None (XAdES is off). At this moment XAdES signature type is supported only for Spreadsheet documents.             ")
  public XadESTypeEnum getXadESType() {
    return xadESType;
  }

  public void setXadESType(XadESTypeEnum xadESType) {
    this.xadESType = xadESType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignDigitalOptions signDigitalOptions = (SignDigitalOptions) o;
    return Objects.equals(this.reason, signDigitalOptions.reason) &&
        Objects.equals(this.contact, signDigitalOptions.contact) &&
        Objects.equals(this.location, signDigitalOptions.location) &&
        Objects.equals(this.visible, signDigitalOptions.visible) &&
        Objects.equals(this.password, signDigitalOptions.password) &&
        Objects.equals(this.certificateFilePath, signDigitalOptions.certificateFilePath) &&
        Objects.equals(this.xadESType, signDigitalOptions.xadESType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, contact, location, visible, password, certificateFilePath, xadESType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignDigitalOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    certificateFilePath: ").append(toIndentedString(certificateFilePath)).append("\n");
    sb.append("    xadESType: ").append(toIndentedString(xadESType)).append("\n");
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

