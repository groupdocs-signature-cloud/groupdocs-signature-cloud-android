/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DigitalVBA.java">
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
 * DigitalVBA
 */
public class DigitalVBA {
  @SerializedName("password")
  private String password = null;

  @SerializedName("certificateFilePath")
  private String certificateFilePath = null;

  @SerializedName("signOnlyVBAProject")
  private Boolean signOnlyVBAProject = null;

  @SerializedName("comments")
  private String comments = null;

  public DigitalVBA password(String password) {
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

  public DigitalVBA certificateFilePath(String certificateFilePath) {
    this.certificateFilePath = certificateFilePath;
    return this;
  }

   /**
   * Gets or sets the digital certificate file path
   * @return certificateFilePath
  **/
  @ApiModelProperty(value = "Gets or sets the digital certificate file path")
  public String getCertificateFilePath() {
    return certificateFilePath;
  }

  public void setCertificateFilePath(String certificateFilePath) {
    this.certificateFilePath = certificateFilePath;
  }

  public DigitalVBA signOnlyVBAProject(Boolean signOnlyVBAProject) {
    this.signOnlyVBAProject = signOnlyVBAProject;
    return this;
  }

   /**
   * Gets or sets setting of only VBA project signing. If set to true, the SpreadSheet document will not be signed, but the VBA project will be signed.             
   * @return signOnlyVBAProject
  **/
  @ApiModelProperty(required = true, value = "Gets or sets setting of only VBA project signing. If set to true, the SpreadSheet document will not be signed, but the VBA project will be signed.             ")
  public Boolean getSignOnlyVBAProject() {
    return signOnlyVBAProject;
  }

  public void setSignOnlyVBAProject(Boolean signOnlyVBAProject) {
    this.signOnlyVBAProject = signOnlyVBAProject;
  }

  public DigitalVBA comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Gets or sets the signature comments.
   * @return comments
  **/
  @ApiModelProperty(value = "Gets or sets the signature comments.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalVBA digitalVBA = (DigitalVBA) o;
    return Objects.equals(this.password, digitalVBA.password) &&
        Objects.equals(this.certificateFilePath, digitalVBA.certificateFilePath) &&
        Objects.equals(this.signOnlyVBAProject, digitalVBA.signOnlyVBAProject) &&
        Objects.equals(this.comments, digitalVBA.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, certificateFilePath, signOnlyVBAProject, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalVBA {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    certificateFilePath: ").append(toIndentedString(certificateFilePath)).append("\n");
    sb.append("    signOnlyVBAProject: ").append(toIndentedString(signOnlyVBAProject)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

