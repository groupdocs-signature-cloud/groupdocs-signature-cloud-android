/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SearchBarcodeOptions.java">
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
import com.groupdocs.cloud.signature.model.PagesSetup;
import com.groupdocs.cloud.signature.model.SearchOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines options to Search barcode signature within a document
 */
@ApiModel(description = "Defines options to Search barcode signature within a document")
public class SearchBarcodeOptions extends SearchOptions {
  @SerializedName("barcodeType")
  private String barcodeType = null;

  @SerializedName("text")
  private String text = null;

  /**
   * Get or set barcode text match type search. It is used only when Text property is set
   */
  @JsonAdapter(MatchTypeEnum.Adapter.class)
  public enum MatchTypeEnum {
    EXACT("Exact"),
    
    STARTSWITH("StartsWith"),
    
    ENDSWITH("EndsWith"),
    
    CONTAINS("Contains");

    private String value;

    MatchTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchTypeEnum fromValue(String text) {
      for (MatchTypeEnum b : MatchTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MatchTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MatchTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("matchType")
  private MatchTypeEnum matchType = null;

  public SearchBarcodeOptions barcodeType(String barcodeType) {
    this.barcodeType = barcodeType;
    return this;
  }

   /**
   * Specifies encode type property to search barcodes. If this value is not set, search is processed for all supported barcode Types
   * @return barcodeType
  **/
  @ApiModelProperty(value = "Specifies encode type property to search barcodes. If this value is not set, search is processed for all supported barcode Types")
  public String getBarcodeType() {
    return barcodeType;
  }

  public void setBarcodeType(String barcodeType) {
    this.barcodeType = barcodeType;
  }

  public SearchBarcodeOptions text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Specifies text for searching and matching in barcode signature
   * @return text
  **/
  @ApiModelProperty(value = "Specifies text for searching and matching in barcode signature")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SearchBarcodeOptions matchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Get or set barcode text match type search. It is used only when Text property is set
   * @return matchType
  **/
  @ApiModelProperty(required = true, value = "Get or set barcode text match type search. It is used only when Text property is set")
  public MatchTypeEnum getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchBarcodeOptions searchBarcodeOptions = (SearchBarcodeOptions) o;
    return Objects.equals(this.barcodeType, searchBarcodeOptions.barcodeType) &&
        Objects.equals(this.text, searchBarcodeOptions.text) &&
        Objects.equals(this.matchType, searchBarcodeOptions.matchType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodeType, text, matchType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchBarcodeOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    barcodeType: ").append(toIndentedString(barcodeType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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

