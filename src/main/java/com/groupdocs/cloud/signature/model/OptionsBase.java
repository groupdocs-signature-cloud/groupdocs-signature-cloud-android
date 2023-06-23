/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="OptionsBase.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Base container class for all possible options data
 */
@ApiModel(description = "Base container class for all possible options data")
public class OptionsBase {
  /**
   * Specifies the signature type of processing
   */
  @JsonAdapter(SignatureTypeEnum.Adapter.class)
  public enum SignatureTypeEnum {
    NONE("None"),
    
    TEXT("Text"),
    
    IMAGE("Image"),
    
    DIGITAL("Digital"),
    
    BARCODE("Barcode"),
    
    QRCODE("QRCode"),
    
    STAMP("Stamp"),
    
    FORMFIELD("FormField"),
    
    METADATA("Metadata");

    private String value;

    SignatureTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignatureTypeEnum fromValue(String text) {
      for (SignatureTypeEnum b : SignatureTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SignatureTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignatureTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignatureTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SignatureTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("signatureType")
  private SignatureTypeEnum signatureType = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("allPages")
  private Boolean allPages = null;

  @SerializedName("pagesSetup")
  private PagesSetup pagesSetup = null;

  public OptionsBase signatureType(SignatureTypeEnum signatureType) {
    this.signatureType = signatureType;
    return this;
  }

   /**
   * Specifies the signature type of processing
   * @return signatureType
  **/
  @ApiModelProperty(required = true, value = "Specifies the signature type of processing")
  public SignatureTypeEnum getSignatureType() {
    return signatureType;
  }

  public void setSignatureType(SignatureTypeEnum signatureType) {
    this.signatureType = signatureType;
  }

  public OptionsBase page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Gets or sets a document page number for processing. Value is optional
   * @return page
  **/
  @ApiModelProperty(value = "Gets or sets a document page number for processing. Value is optional")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public OptionsBase allPages(Boolean allPages) {
    this.allPages = allPages;
    return this;
  }

   /**
   * Process all document pages. Type of processing depends on SignatureType For Images Document Type it can be used only for multi-frames images like .tiff
   * @return allPages
  **/
  @ApiModelProperty(required = true, value = "Process all document pages. Type of processing depends on SignatureType For Images Document Type it can be used only for multi-frames images like .tiff")
  public Boolean getAllPages() {
    return allPages;
  }

  public void setAllPages(Boolean allPages) {
    this.allPages = allPages;
  }

  public OptionsBase pagesSetup(PagesSetup pagesSetup) {
    this.pagesSetup = pagesSetup;
    return this;
  }

   /**
   * Options to specify pages for processing
   * @return pagesSetup
  **/
  @ApiModelProperty(value = "Options to specify pages for processing")
  public PagesSetup getPagesSetup() {
    return pagesSetup;
  }

  public void setPagesSetup(PagesSetup pagesSetup) {
    this.pagesSetup = pagesSetup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionsBase optionsBase = (OptionsBase) o;
    return Objects.equals(this.signatureType, optionsBase.signatureType) &&
        Objects.equals(this.page, optionsBase.page) &&
        Objects.equals(this.allPages, optionsBase.allPages) &&
        Objects.equals(this.pagesSetup, optionsBase.pagesSetup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureType, page, allPages, pagesSetup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionsBase {\n");
    
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    allPages: ").append(toIndentedString(allPages)).append("\n");
    sb.append("    pagesSetup: ").append(toIndentedString(pagesSetup)).append("\n");
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

