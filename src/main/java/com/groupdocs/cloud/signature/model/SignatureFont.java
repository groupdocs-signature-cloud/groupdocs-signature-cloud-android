/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SignatureFont.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Create instance of SignatureFont class to specify Font properties
 */
@ApiModel(description = "Create instance of SignatureFont class to specify Font properties")
public class SignatureFont {
  @SerializedName("fontFamily")
  private String fontFamily = null;

  @SerializedName("fontSize")
  private Double fontSize = null;

  @SerializedName("bold")
  private Boolean bold = null;

  @SerializedName("italic")
  private Boolean italic = null;

  @SerializedName("underline")
  private Boolean underline = null;

  public SignatureFont fontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

   /**
   * Font Family Name
   * @return fontFamily
  **/
  @ApiModelProperty(value = "Font Family Name")
  public String getFontFamily() {
    return fontFamily;
  }

  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }

  public SignatureFont fontSize(Double fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Font Size 
   * @return fontSize
  **/
  @ApiModelProperty(required = true, value = "Font Size ")
  public Double getFontSize() {
    return fontSize;
  }

  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  public SignatureFont bold(Boolean bold) {
    this.bold = bold;
    return this;
  }

   /**
   * Apply Font Bold Style
   * @return bold
  **/
  @ApiModelProperty(required = true, value = "Apply Font Bold Style")
  public Boolean getBold() {
    return bold;
  }

  public void setBold(Boolean bold) {
    this.bold = bold;
  }

  public SignatureFont italic(Boolean italic) {
    this.italic = italic;
    return this;
  }

   /**
   * Apply Font Italic Style
   * @return italic
  **/
  @ApiModelProperty(required = true, value = "Apply Font Italic Style")
  public Boolean getItalic() {
    return italic;
  }

  public void setItalic(Boolean italic) {
    this.italic = italic;
  }

  public SignatureFont underline(Boolean underline) {
    this.underline = underline;
    return this;
  }

   /**
   * Apply Underline Style
   * @return underline
  **/
  @ApiModelProperty(required = true, value = "Apply Underline Style")
  public Boolean getUnderline() {
    return underline;
  }

  public void setUnderline(Boolean underline) {
    this.underline = underline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureFont signatureFont = (SignatureFont) o;
    return Objects.equals(this.fontFamily, signatureFont.fontFamily) &&
        Objects.equals(this.fontSize, signatureFont.fontSize) &&
        Objects.equals(this.bold, signatureFont.bold) &&
        Objects.equals(this.italic, signatureFont.italic) &&
        Objects.equals(this.underline, signatureFont.underline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontFamily, fontSize, bold, italic, underline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureFont {\n");
    
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
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

