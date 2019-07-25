/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SaveOptions.java">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
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
 * Base document save options class
 */
@ApiModel(description = "Base document save options class")
public class SaveOptions {
  @SerializedName("overwriteExisting")
  private Boolean overwriteExisting = null;

  @SerializedName("outputFilePath")
  private String outputFilePath = null;

  @SerializedName("saveFormat")
  private String saveFormat = null;

  public SaveOptions overwriteExisting(Boolean overwriteExisting) {
    this.overwriteExisting = overwriteExisting;
    return this;
  }

   /**
   * Overwrite existing file with new output file. Otherwise new file will be created with number as suffix
   * @return overwriteExisting
  **/
  @ApiModelProperty(required = true, value = "Overwrite existing file with new output file. Otherwise new file will be created with number as suffix")
  public Boolean getOverwriteExisting() {
    return overwriteExisting;
  }

  public void setOverwriteExisting(Boolean overwriteExisting) {
    this.overwriteExisting = overwriteExisting;
  }

  public SaveOptions outputFilePath(String outputFilePath) {
    this.outputFilePath = outputFilePath;
    return this;
  }

   /**
   * Output file name
   * @return outputFilePath
  **/
  @ApiModelProperty(value = "Output file name")
  public String getOutputFilePath() {
    return outputFilePath;
  }

  public void setOutputFilePath(String outputFilePath) {
    this.outputFilePath = outputFilePath;
  }

  public SaveOptions saveFormat(String saveFormat) {
    this.saveFormat = saveFormat;
    return this;
  }

   /**
   * format of save
   * @return saveFormat
  **/
  @ApiModelProperty(value = "format of save")
  public String getSaveFormat() {
    return saveFormat;
  }

  public void setSaveFormat(String saveFormat) {
    this.saveFormat = saveFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveOptions saveOptions = (SaveOptions) o;
    return Objects.equals(this.overwriteExisting, saveOptions.overwriteExisting) &&
        Objects.equals(this.outputFilePath, saveOptions.outputFilePath) &&
        Objects.equals(this.saveFormat, saveOptions.saveFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overwriteExisting, outputFilePath, saveFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveOptions {\n");
    
    sb.append("    overwriteExisting: ").append(toIndentedString(overwriteExisting)).append("\n");
    sb.append("    outputFilePath: ").append(toIndentedString(outputFilePath)).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(saveFormat)).append("\n");
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

