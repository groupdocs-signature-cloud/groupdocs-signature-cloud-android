/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SignBarcodeOptions.java">
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
import com.groupdocs.cloud.signature.model.Brush;
import com.groupdocs.cloud.signature.model.Color;
import com.groupdocs.cloud.signature.model.Padding;
import com.groupdocs.cloud.signature.model.PagesSetup;
import com.groupdocs.cloud.signature.model.SignTextOptions;
import com.groupdocs.cloud.signature.model.SignatureFont;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents the Barcode signature options
 */
@ApiModel(description = "Represents the Barcode signature options")
public class SignBarcodeOptions extends SignTextOptions {
  @SerializedName("barcodeType")
  private String barcodeType = null;

  @SerializedName("borderWeight")
  private Double borderWeight = null;

  @SerializedName("opacity")
  private Double opacity = null;

  /**
   * Gets or sets the alignment of text in the result Barcode Default value is None
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

  public SignBarcodeOptions barcodeType(String barcodeType) {
    this.barcodeType = barcodeType;
    return this;
  }

   /**
   * Get or set Barcode type. Pick one from supported barcode types list
   * @return barcodeType
  **/
  @ApiModelProperty(value = "Get or set Barcode type. Pick one from supported barcode types list")
  public String getBarcodeType() {
    return barcodeType;
  }

  public void setBarcodeType(String barcodeType) {
    this.barcodeType = barcodeType;
  }

  public SignBarcodeOptions borderWeight(Double borderWeight) {
    this.borderWeight = borderWeight;
    return this;
  }

   /**
   * Gets or sets the weight of the signature border
   * @return borderWeight
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the weight of the signature border")
  public Double getBorderWeight() {
    return borderWeight;
  }

  public void setBorderWeight(Double borderWeight) {
    this.borderWeight = borderWeight;
  }

  public SignBarcodeOptions opacity(Double opacity) {
    this.opacity = opacity;
    return this;
  }

   /**
   * Gets or sets the signature opacity (value from 0.0 (clear) through 1.0 (opaque)). By default the value is 1.0
   * @return opacity
  **/
  @ApiModelProperty(value = "Gets or sets the signature opacity (value from 0.0 (clear) through 1.0 (opaque)). By default the value is 1.0")
  public Double getOpacity() {
    return opacity;
  }

  public void setOpacity(Double opacity) {
    this.opacity = opacity;
  }

  public SignBarcodeOptions codeTextAlignment(CodeTextAlignmentEnum codeTextAlignment) {
    this.codeTextAlignment = codeTextAlignment;
    return this;
  }

   /**
   * Gets or sets the alignment of text in the result Barcode Default value is None
   * @return codeTextAlignment
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the alignment of text in the result Barcode Default value is None")
  public CodeTextAlignmentEnum getCodeTextAlignment() {
    return codeTextAlignment;
  }

  public void setCodeTextAlignment(CodeTextAlignmentEnum codeTextAlignment) {
    this.codeTextAlignment = codeTextAlignment;
  }

  public SignBarcodeOptions innerMargins(Padding innerMargins) {
    this.innerMargins = innerMargins;
    return this;
  }

   /**
   * Gets or sets the space between Barcode elements and result image borders
   * @return innerMargins
  **/
  @ApiModelProperty(value = "Gets or sets the space between Barcode elements and result image borders")
  public Padding getInnerMargins() {
    return innerMargins;
  }

  public void setInnerMargins(Padding innerMargins) {
    this.innerMargins = innerMargins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignBarcodeOptions signBarcodeOptions = (SignBarcodeOptions) o;
    return Objects.equals(this.barcodeType, signBarcodeOptions.barcodeType) &&
        Objects.equals(this.borderWeight, signBarcodeOptions.borderWeight) &&
        Objects.equals(this.opacity, signBarcodeOptions.opacity) &&
        Objects.equals(this.codeTextAlignment, signBarcodeOptions.codeTextAlignment) &&
        Objects.equals(this.innerMargins, signBarcodeOptions.innerMargins) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodeType, borderWeight, opacity, codeTextAlignment, innerMargins, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignBarcodeOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    barcodeType: ").append(toIndentedString(barcodeType)).append("\n");
    sb.append("    borderWeight: ").append(toIndentedString(borderWeight)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    codeTextAlignment: ").append(toIndentedString(codeTextAlignment)).append("\n");
    sb.append("    innerMargins: ").append(toIndentedString(innerMargins)).append("\n");
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

