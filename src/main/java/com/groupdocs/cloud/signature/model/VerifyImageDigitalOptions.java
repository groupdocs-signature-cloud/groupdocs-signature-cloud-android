/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="VerifyImageDigitalOptions.java">
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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defines options to verify ImageDigital signature within a document
 */
@ApiModel(description = "Defines options to verify ImageDigital signature within a document")
public class VerifyImageDigitalOptions extends VerifyOptions {
  @SerializedName("password")
  private String password = null;

  @SerializedName("detectionThresholdPercent")
  private Integer detectionThresholdPercent = null;

  @SerializedName("useFullDataExtraction")
  private Boolean useFullDataExtraction = null;

  public VerifyImageDigitalOptions password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Gets or sets the password used to embed the signature.
   * @return password
  **/
  @ApiModelProperty(value = "Gets or sets the password used to embed the signature.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public VerifyImageDigitalOptions detectionThresholdPercent(Integer detectionThresholdPercent) {
    this.detectionThresholdPercent = detectionThresholdPercent;
    return this;
  }

   /**
   * Gets or sets the detection threshold percentage (0-100).
   * @return detectionThresholdPercent
  **/
  @ApiModelProperty(value = "Gets or sets the detection threshold percentage (0-100).")
  public Integer getDetectionThresholdPercent() {
    return detectionThresholdPercent;
  }

  public void setDetectionThresholdPercent(Integer detectionThresholdPercent) {
    this.detectionThresholdPercent = detectionThresholdPercent;
  }

  public VerifyImageDigitalOptions useFullDataExtraction(Boolean useFullDataExtraction) {
    this.useFullDataExtraction = useFullDataExtraction;
    return this;
  }

   /**
   * Gets or sets whether to use full data extraction for maximum accuracy.
   * @return useFullDataExtraction
  **/
  @ApiModelProperty(required = true, value = "Gets or sets whether to use full data extraction for maximum accuracy.")
  public Boolean getUseFullDataExtraction() {
    return useFullDataExtraction;
  }

  public void setUseFullDataExtraction(Boolean useFullDataExtraction) {
    this.useFullDataExtraction = useFullDataExtraction;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyImageDigitalOptions that = (VerifyImageDigitalOptions) o;
    return Objects.equals(this.password, that.password) &&
        Objects.equals(this.detectionThresholdPercent, that.detectionThresholdPercent) &&
        Objects.equals(this.useFullDataExtraction, that.useFullDataExtraction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, detectionThresholdPercent, useFullDataExtraction, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyImageDigitalOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    detectionThresholdPercent: ").append(toIndentedString(detectionThresholdPercent)).append("\n");
    sb.append("    useFullDataExtraction: ").append(toIndentedString(useFullDataExtraction)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
