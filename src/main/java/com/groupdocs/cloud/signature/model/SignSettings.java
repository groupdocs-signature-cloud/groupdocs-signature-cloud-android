/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SignSettings.java">
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
import com.groupdocs.cloud.signature.model.BaseSettings;
import com.groupdocs.cloud.signature.model.FileInfo;
import com.groupdocs.cloud.signature.model.SaveOptions;
import com.groupdocs.cloud.signature.model.SignOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines sign document settings request
 */
@ApiModel(description = "Defines sign document settings request")
public class SignSettings extends BaseSettings {
  @SerializedName("options")
  private List<SignOptions> options = null;

  @SerializedName("saveOptions")
  private SaveOptions saveOptions = null;

  public SignSettings options(List<SignOptions> options) {
    this.options = options;
    return this;
  }

  public SignSettings addOptionsItem(SignOptions optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<SignOptions>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Gets or sets options to perform document signing
   * @return options
  **/
  @ApiModelProperty(value = "Gets or sets options to perform document signing")
  public List<SignOptions> getOptions() {
    return options;
  }

  public void setOptions(List<SignOptions> options) {
    this.options = options;
  }

  public SignSettings saveOptions(SaveOptions saveOptions) {
    this.saveOptions = saveOptions;
    return this;
  }

   /**
   * Gets or sets format specific save options for output file
   * @return saveOptions
  **/
  @ApiModelProperty(value = "Gets or sets format specific save options for output file")
  public SaveOptions getSaveOptions() {
    return saveOptions;
  }

  public void setSaveOptions(SaveOptions saveOptions) {
    this.saveOptions = saveOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignSettings signSettings = (SignSettings) o;
    return Objects.equals(this.options, signSettings.options) &&
        Objects.equals(this.saveOptions, signSettings.saveOptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, saveOptions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignSettings {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    saveOptions: ").append(toIndentedString(saveOptions)).append("\n");
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

