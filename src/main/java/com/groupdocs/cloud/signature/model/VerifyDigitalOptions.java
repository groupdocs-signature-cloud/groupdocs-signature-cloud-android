/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="VerifyDigitalOptions.java">
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
import com.groupdocs.cloud.signature.model.PagesSetup;
import com.groupdocs.cloud.signature.model.VerifyOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Defines options to verify Digital signature within a document
 */
@ApiModel(description = "Defines options to verify Digital signature within a document")
public class VerifyDigitalOptions extends VerifyOptions {
  @SerializedName("password")
  private String password = null;

  @SerializedName("certificateFilePath")
  private String certificateFilePath = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("signDateTimeFrom")
  private OffsetDateTime signDateTimeFrom = null;

  @SerializedName("signDateTimeTo")
  private OffsetDateTime signDateTimeTo = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("location")
  private String location = null;

  public VerifyDigitalOptions password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password of Digital Certificate if required
   * @return password
  **/
  @ApiModelProperty(value = "Password of Digital Certificate if required")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public VerifyDigitalOptions certificateFilePath(String certificateFilePath) {
    this.certificateFilePath = certificateFilePath;
    return this;
  }

   /**
   * File Guid of Digital Certificate
   * @return certificateFilePath
  **/
  @ApiModelProperty(value = "File Guid of Digital Certificate")
  public String getCertificateFilePath() {
    return certificateFilePath;
  }

  public void setCertificateFilePath(String certificateFilePath) {
    this.certificateFilePath = certificateFilePath;
  }

  public VerifyDigitalOptions comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Comments of Digital Signature to validate Suitable for Spreadsheet and Words Processing document types
   * @return comments
  **/
  @ApiModelProperty(value = "Comments of Digital Signature to validate Suitable for Spreadsheet and Words Processing document types")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public VerifyDigitalOptions signDateTimeFrom(OffsetDateTime signDateTimeFrom) {
    this.signDateTimeFrom = signDateTimeFrom;
    return this;
  }

   /**
   * Date and time range of Digital Signature to validate. Null value will be ignored. Suitable for Spreadsheet and Words Processing document types
   * @return signDateTimeFrom
  **/
  @ApiModelProperty(value = "Date and time range of Digital Signature to validate. Null value will be ignored. Suitable for Spreadsheet and Words Processing document types")
  public OffsetDateTime getSignDateTimeFrom() {
    return signDateTimeFrom;
  }

  public void setSignDateTimeFrom(OffsetDateTime signDateTimeFrom) {
    this.signDateTimeFrom = signDateTimeFrom;
  }

  public VerifyDigitalOptions signDateTimeTo(OffsetDateTime signDateTimeTo) {
    this.signDateTimeTo = signDateTimeTo;
    return this;
  }

   /**
   * Date and time range of Digital Signature to validate. Null value will be ignored Suitable for Spreadsheet and Words Processing document types
   * @return signDateTimeTo
  **/
  @ApiModelProperty(value = "Date and time range of Digital Signature to validate. Null value will be ignored Suitable for Spreadsheet and Words Processing document types")
  public OffsetDateTime getSignDateTimeTo() {
    return signDateTimeTo;
  }

  public void setSignDateTimeTo(OffsetDateTime signDateTimeTo) {
    this.signDateTimeTo = signDateTimeTo;
  }

  public VerifyDigitalOptions reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason of Digital Signature to validate Suitable for Pdf document type
   * @return reason
  **/
  @ApiModelProperty(value = "Reason of Digital Signature to validate Suitable for Pdf document type")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public VerifyDigitalOptions contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Signature Contact to validate Suitable for Pdf document type
   * @return contact
  **/
  @ApiModelProperty(value = "Signature Contact to validate Suitable for Pdf document type")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public VerifyDigitalOptions location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Signature Location to validate Suitable for Pdf document type
   * @return location
  **/
  @ApiModelProperty(value = "Signature Location to validate Suitable for Pdf document type")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyDigitalOptions verifyDigitalOptions = (VerifyDigitalOptions) o;
    return Objects.equals(this.password, verifyDigitalOptions.password) &&
        Objects.equals(this.certificateFilePath, verifyDigitalOptions.certificateFilePath) &&
        Objects.equals(this.comments, verifyDigitalOptions.comments) &&
        Objects.equals(this.signDateTimeFrom, verifyDigitalOptions.signDateTimeFrom) &&
        Objects.equals(this.signDateTimeTo, verifyDigitalOptions.signDateTimeTo) &&
        Objects.equals(this.reason, verifyDigitalOptions.reason) &&
        Objects.equals(this.contact, verifyDigitalOptions.contact) &&
        Objects.equals(this.location, verifyDigitalOptions.location) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, certificateFilePath, comments, signDateTimeFrom, signDateTimeTo, reason, contact, location, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyDigitalOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    certificateFilePath: ").append(toIndentedString(certificateFilePath)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    signDateTimeFrom: ").append(toIndentedString(signDateTimeFrom)).append("\n");
    sb.append("    signDateTimeTo: ").append(toIndentedString(signDateTimeTo)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

