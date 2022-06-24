/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SignatureAppearance.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Appearance is a base class for keeping additional information for various options
 */
@ApiModel(description = "Appearance is a base class for keeping additional information for various options")
public class SignatureAppearance {
  /**
   * Specifies the type of appearance
   */
  @JsonAdapter(AppearanceTypeEnum.Adapter.class)
  public enum AppearanceTypeEnum {
    UNDEFINED("Undefined"),
    
    PDFTEXTANNOTATION("PdfTextAnnotation"),
    
    PDFTEXTSTICKER("PdfTextSticker"),
    
    IMAGE("Image"),
    
    DIGITALSIGNATURE("DigitalSignature"),
    
    PDFDIGITALSIGNATURE("PdfDigitalSignature");

    private String value;

    AppearanceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AppearanceTypeEnum fromValue(String text) {
      for (AppearanceTypeEnum b : AppearanceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AppearanceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AppearanceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AppearanceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AppearanceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("appearanceType")
  private AppearanceTypeEnum appearanceType = null;

  public SignatureAppearance appearanceType(AppearanceTypeEnum appearanceType) {
    this.appearanceType = appearanceType;
    return this;
  }

   /**
   * Specifies the type of appearance
   * @return appearanceType
  **/
  @ApiModelProperty(required = true, value = "Specifies the type of appearance")
  public AppearanceTypeEnum getAppearanceType() {
    return appearanceType;
  }

  public void setAppearanceType(AppearanceTypeEnum appearanceType) {
    this.appearanceType = appearanceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureAppearance signatureAppearance = (SignatureAppearance) o;
    return Objects.equals(this.appearanceType, signatureAppearance.appearanceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appearanceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureAppearance {\n");
    
    sb.append("    appearanceType: ").append(toIndentedString(appearanceType)).append("\n");
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

