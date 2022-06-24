/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SignQRCodeOptions.java">
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
import com.groupdocs.cloud.signature.model.BorderLine;
import com.groupdocs.cloud.signature.model.Brush;
import com.groupdocs.cloud.signature.model.Color;
import com.groupdocs.cloud.signature.model.Padding;
import com.groupdocs.cloud.signature.model.PagesSetup;
import com.groupdocs.cloud.signature.model.SignTextOptions;
import com.groupdocs.cloud.signature.model.SignatureAppearance;
import com.groupdocs.cloud.signature.model.SignatureFont;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents the QR-code signature options
 */
@ApiModel(description = "Represents the QR-code signature options")
public class SignQRCodeOptions extends SignTextOptions {
  @SerializedName("qrCodeType")
  private String qrCodeType = null;

  @SerializedName("transparency")
  private Double transparency = null;

  /**
   * Gets or sets the alignment of text in the result QR-code Default value is None
   */
  @JsonAdapter(CodeTextAlignmentEnum.Adapter.class)
  public enum CodeTextAlignmentEnum {
    NONE("None"),
    
    ABOVE("Above"),
    
    BELOW("Below"),
    
    RIGHT("Right");

    private String value;

    CodeTextAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeTextAlignmentEnum fromValue(String text) {
      for (CodeTextAlignmentEnum b : CodeTextAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodeTextAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeTextAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeTextAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodeTextAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("codeTextAlignment")
  private CodeTextAlignmentEnum codeTextAlignment = null;

  @SerializedName("innerMargins")
  private Padding innerMargins = null;

  @SerializedName("logoFilePath")
  private String logoFilePath = null;

  public SignQRCodeOptions qrCodeType(String qrCodeType) {
    this.qrCodeType = qrCodeType;
    return this;
  }

   /**
   * Get or set QRCode type. Value should be one from supported QRCode types list
   * @return qrCodeType
  **/
  @ApiModelProperty(value = "Get or set QRCode type. Value should be one from supported QRCode types list")
  public String getQrCodeType() {
    return qrCodeType;
  }

  public void setQrCodeType(String qrCodeType) {
    this.qrCodeType = qrCodeType;
  }

  public SignQRCodeOptions transparency(Double transparency) {
    this.transparency = transparency;
    return this;
  }

   /**
   * Gets or sets the signature transparency (value from 0.0 (opaque) through 1.0 (clear)). Default value is 0 (opaque).             
   * @return transparency
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the signature transparency (value from 0.0 (opaque) through 1.0 (clear)). Default value is 0 (opaque).             ")
  public Double getTransparency() {
    return transparency;
  }

  public void setTransparency(Double transparency) {
    this.transparency = transparency;
  }

  public SignQRCodeOptions codeTextAlignment(CodeTextAlignmentEnum codeTextAlignment) {
    this.codeTextAlignment = codeTextAlignment;
    return this;
  }

   /**
   * Gets or sets the alignment of text in the result QR-code Default value is None
   * @return codeTextAlignment
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the alignment of text in the result QR-code Default value is None")
  public CodeTextAlignmentEnum getCodeTextAlignment() {
    return codeTextAlignment;
  }

  public void setCodeTextAlignment(CodeTextAlignmentEnum codeTextAlignment) {
    this.codeTextAlignment = codeTextAlignment;
  }

  public SignQRCodeOptions innerMargins(Padding innerMargins) {
    this.innerMargins = innerMargins;
    return this;
  }

   /**
   * Gets or sets the space between QRCode elements and result image borders
   * @return innerMargins
  **/
  @ApiModelProperty(value = "Gets or sets the space between QRCode elements and result image borders")
  public Padding getInnerMargins() {
    return innerMargins;
  }

  public void setInnerMargins(Padding innerMargins) {
    this.innerMargins = innerMargins;
  }

  public SignQRCodeOptions logoFilePath(String logoFilePath) {
    this.logoFilePath = logoFilePath;
    return this;
  }

   /**
   * Gets or sets the QR-code logo image file name. This property in use only if LogoStream is not specified. Using of this property could cause problems with verification. Use it carefully
   * @return logoFilePath
  **/
  @ApiModelProperty(value = "Gets or sets the QR-code logo image file name. This property in use only if LogoStream is not specified. Using of this property could cause problems with verification. Use it carefully")
  public String getLogoFilePath() {
    return logoFilePath;
  }

  public void setLogoFilePath(String logoFilePath) {
    this.logoFilePath = logoFilePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignQRCodeOptions signQRCodeOptions = (SignQRCodeOptions) o;
    return Objects.equals(this.qrCodeType, signQRCodeOptions.qrCodeType) &&
        Objects.equals(this.transparency, signQRCodeOptions.transparency) &&
        Objects.equals(this.codeTextAlignment, signQRCodeOptions.codeTextAlignment) &&
        Objects.equals(this.innerMargins, signQRCodeOptions.innerMargins) &&
        Objects.equals(this.logoFilePath, signQRCodeOptions.logoFilePath) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qrCodeType, transparency, codeTextAlignment, innerMargins, logoFilePath, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignQRCodeOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    qrCodeType: ").append(toIndentedString(qrCodeType)).append("\n");
    sb.append("    transparency: ").append(toIndentedString(transparency)).append("\n");
    sb.append("    codeTextAlignment: ").append(toIndentedString(codeTextAlignment)).append("\n");
    sb.append("    innerMargins: ").append(toIndentedString(innerMargins)).append("\n");
    sb.append("    logoFilePath: ").append(toIndentedString(logoFilePath)).append("\n");
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

