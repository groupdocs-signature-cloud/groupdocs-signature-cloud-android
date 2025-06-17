/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DigitalSignatureAppearance.java">
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
import com.groupdocs.cloud.signature.model.SignatureAppearance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describes appearance of Signature Line for Digital Signature. One Signature Line could be applied for only one Digital Signature. Signature Line always is on the first page. This feature may be useful for .docx, .doc, .odt and .xlsx file formats.
 */
@ApiModel(description = "Describes appearance of Signature Line for Digital Signature. One Signature Line could be applied for only one Digital Signature. Signature Line always is on the first page. This feature may be useful for .docx, .doc, .odt and .xlsx file formats.")
public class DigitalSignatureAppearance extends SignatureAppearance {
  @SerializedName("email")
  private String email = null;

  @SerializedName("signer")
  private String signer = null;

  @SerializedName("title")
  private String title = null;

  public DigitalSignatureAppearance email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Gets or sets a email that will be displayed in signature line.
   * @return email
  **/
  @ApiModelProperty(value = "Gets or sets a email that will be displayed in signature line.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DigitalSignatureAppearance signer(String signer) {
    this.signer = signer;
    return this;
  }

   /**
   * Gets or sets signer name for signature line.
   * @return signer
  **/
  @ApiModelProperty(value = "Gets or sets signer name for signature line.")
  public String getSigner() {
    return signer;
  }

  public void setSigner(String signer) {
    this.signer = signer;
  }

  public DigitalSignatureAppearance title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Gets or sets a title for signature line.
   * @return title
  **/
  @ApiModelProperty(value = "Gets or sets a title for signature line.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalSignatureAppearance digitalSignatureAppearance = (DigitalSignatureAppearance) o;
    return Objects.equals(this.email, digitalSignatureAppearance.email) &&
        Objects.equals(this.signer, digitalSignatureAppearance.signer) &&
        Objects.equals(this.title, digitalSignatureAppearance.title) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, signer, title, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalSignatureAppearance {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

