/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PreviewSettings.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines preview request settings
 */
@ApiModel(description = "Defines preview request settings")
public class PreviewSettings extends BaseSettings {
  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("pageNumbers")
  private List<Integer> pageNumbers = null;

  /**
   * Preview format
   */
  @JsonAdapter(PreviewFormatEnum.Adapter.class)
  public enum PreviewFormatEnum {
    PNG("PNG"),
    
    JPEG("JPEG"),
    
    BMP("BMP");

    private String value;

    PreviewFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PreviewFormatEnum fromValue(String text) {
      for (PreviewFormatEnum b : PreviewFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PreviewFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PreviewFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PreviewFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PreviewFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("previewFormat")
  private PreviewFormatEnum previewFormat = null;

  @SerializedName("hideSignatures")
  private Boolean hideSignatures = null;

  @SerializedName("outputPath")
  private String outputPath = null;

  public PreviewSettings width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Preview images width
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Preview images width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public PreviewSettings height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Preview images height
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Preview images height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PreviewSettings pageNumbers(List<Integer> pageNumbers) {
    this.pageNumbers = pageNumbers;
    return this;
  }

  public PreviewSettings addPageNumbersItem(Integer pageNumbersItem) {
    if (this.pageNumbers == null) {
      this.pageNumbers = new ArrayList<Integer>();
    }
    this.pageNumbers.add(pageNumbersItem);
    return this;
  }

   /**
   * Preview page numbers
   * @return pageNumbers
  **/
  @ApiModelProperty(value = "Preview page numbers")
  public List<Integer> getPageNumbers() {
    return pageNumbers;
  }

  public void setPageNumbers(List<Integer> pageNumbers) {
    this.pageNumbers = pageNumbers;
  }

  public PreviewSettings previewFormat(PreviewFormatEnum previewFormat) {
    this.previewFormat = previewFormat;
    return this;
  }

   /**
   * Preview format
   * @return previewFormat
  **/
  @ApiModelProperty(required = true, value = "Preview format")
  public PreviewFormatEnum getPreviewFormat() {
    return previewFormat;
  }

  public void setPreviewFormat(PreviewFormatEnum previewFormat) {
    this.previewFormat = previewFormat;
  }

  public PreviewSettings hideSignatures(Boolean hideSignatures) {
    this.hideSignatures = hideSignatures;
    return this;
  }

   /**
   * Flag to hide signatures from page preview image. Only signatures are marked as IsSignature will be hidden from generated document page image
   * @return hideSignatures
  **/
  @ApiModelProperty(required = true, value = "Flag to hide signatures from page preview image. Only signatures are marked as IsSignature will be hidden from generated document page image")
  public Boolean getHideSignatures() {
    return hideSignatures;
  }

  public void setHideSignatures(Boolean hideSignatures) {
    this.hideSignatures = hideSignatures;
  }

  public PreviewSettings outputPath(String outputPath) {
    this.outputPath = outputPath;
    return this;
  }

   /**
   * Set path for output pages. If not set then default path used.
   * @return outputPath
  **/
  @ApiModelProperty(value = "Set path for output pages. If not set then default path used.")
  public String getOutputPath() {
    return outputPath;
  }

  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviewSettings previewSettings = (PreviewSettings) o;
    return Objects.equals(this.width, previewSettings.width) &&
        Objects.equals(this.height, previewSettings.height) &&
        Objects.equals(this.pageNumbers, previewSettings.pageNumbers) &&
        Objects.equals(this.previewFormat, previewSettings.previewFormat) &&
        Objects.equals(this.hideSignatures, previewSettings.hideSignatures) &&
        Objects.equals(this.outputPath, previewSettings.outputPath) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, pageNumbers, previewFormat, hideSignatures, outputPath, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviewSettings {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    pageNumbers: ").append(toIndentedString(pageNumbers)).append("\n");
    sb.append("    previewFormat: ").append(toIndentedString(previewFormat)).append("\n");
    sb.append("    hideSignatures: ").append(toIndentedString(hideSignatures)).append("\n");
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
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

