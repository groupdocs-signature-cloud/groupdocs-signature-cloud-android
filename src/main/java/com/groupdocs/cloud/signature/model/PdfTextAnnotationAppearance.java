/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfTextAnnotationAppearance.java">
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.signature.model.BorderLine;
import com.groupdocs.cloud.signature.model.SignatureAppearance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describes appearance of PDF text annotation object (Title, Subject, Content).
 */
@ApiModel(description = "Describes appearance of PDF text annotation object (Title, Subject, Content).")
public class PdfTextAnnotationAppearance extends SignatureAppearance {
  @SerializedName("border")
  private BorderLine border = null;

  /**
   * Gets or sets border effect.
   */
  @JsonAdapter(BorderEffectEnum.Adapter.class)
  public enum BorderEffectEnum {
    NONE("None"),
    
    CLOUDY("Cloudy");

    private String value;

    BorderEffectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BorderEffectEnum fromValue(String text) {
      for (BorderEffectEnum b : BorderEffectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BorderEffectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BorderEffectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BorderEffectEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BorderEffectEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("borderEffect")
  private BorderEffectEnum borderEffect = null;

  @SerializedName("borderEffectIntensity")
  private Integer borderEffectIntensity = null;

  @SerializedName("contents")
  private String contents = null;

  @SerializedName("hcornerRadius")
  private Integer hcornerRadius = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("vcornerRadius")
  private Integer vcornerRadius = null;

  public PdfTextAnnotationAppearance border(BorderLine border) {
    this.border = border;
    return this;
  }

   /**
   * Represents border appearance
   * @return border
  **/
  @ApiModelProperty(value = "Represents border appearance")
  public BorderLine getBorder() {
    return border;
  }

  public void setBorder(BorderLine border) {
    this.border = border;
  }

  public PdfTextAnnotationAppearance borderEffect(BorderEffectEnum borderEffect) {
    this.borderEffect = borderEffect;
    return this;
  }

   /**
   * Gets or sets border effect.
   * @return borderEffect
  **/
  @ApiModelProperty(required = true, value = "Gets or sets border effect.")
  public BorderEffectEnum getBorderEffect() {
    return borderEffect;
  }

  public void setBorderEffect(BorderEffectEnum borderEffect) {
    this.borderEffect = borderEffect;
  }

  public PdfTextAnnotationAppearance borderEffectIntensity(Integer borderEffectIntensity) {
    this.borderEffectIntensity = borderEffectIntensity;
    return this;
  }

   /**
   * Gets or sets border effect intensity. Valid range of value is [0..2].
   * @return borderEffectIntensity
  **/
  @ApiModelProperty(required = true, value = "Gets or sets border effect intensity. Valid range of value is [0..2].")
  public Integer getBorderEffectIntensity() {
    return borderEffectIntensity;
  }

  public void setBorderEffectIntensity(Integer borderEffectIntensity) {
    this.borderEffectIntensity = borderEffectIntensity;
  }

  public PdfTextAnnotationAppearance contents(String contents) {
    this.contents = contents;
    return this;
  }

   /**
   * Gets or sets content of annotation object.
   * @return contents
  **/
  @ApiModelProperty(value = "Gets or sets content of annotation object.")
  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public PdfTextAnnotationAppearance hcornerRadius(Integer hcornerRadius) {
    this.hcornerRadius = hcornerRadius;
    return this;
  }

   /**
   * Gets or sets horizontal corner radius.
   * @return hcornerRadius
  **/
  @ApiModelProperty(required = true, value = "Gets or sets horizontal corner radius.")
  public Integer getHcornerRadius() {
    return hcornerRadius;
  }

  public void setHcornerRadius(Integer hcornerRadius) {
    this.hcornerRadius = hcornerRadius;
  }

  public PdfTextAnnotationAppearance subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Gets or sets Subject representing description of the object.
   * @return subject
  **/
  @ApiModelProperty(value = "Gets or sets Subject representing description of the object.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public PdfTextAnnotationAppearance title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Gets or sets a Title that will be displayed in title bar of annotation object.
   * @return title
  **/
  @ApiModelProperty(value = "Gets or sets a Title that will be displayed in title bar of annotation object.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PdfTextAnnotationAppearance vcornerRadius(Integer vcornerRadius) {
    this.vcornerRadius = vcornerRadius;
    return this;
  }

   /**
   * Gets or sets vertical corner radius.
   * @return vcornerRadius
  **/
  @ApiModelProperty(required = true, value = "Gets or sets vertical corner radius.")
  public Integer getVcornerRadius() {
    return vcornerRadius;
  }

  public void setVcornerRadius(Integer vcornerRadius) {
    this.vcornerRadius = vcornerRadius;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfTextAnnotationAppearance pdfTextAnnotationAppearance = (PdfTextAnnotationAppearance) o;
    return Objects.equals(this.border, pdfTextAnnotationAppearance.border) &&
        Objects.equals(this.borderEffect, pdfTextAnnotationAppearance.borderEffect) &&
        Objects.equals(this.borderEffectIntensity, pdfTextAnnotationAppearance.borderEffectIntensity) &&
        Objects.equals(this.contents, pdfTextAnnotationAppearance.contents) &&
        Objects.equals(this.hcornerRadius, pdfTextAnnotationAppearance.hcornerRadius) &&
        Objects.equals(this.subject, pdfTextAnnotationAppearance.subject) &&
        Objects.equals(this.title, pdfTextAnnotationAppearance.title) &&
        Objects.equals(this.vcornerRadius, pdfTextAnnotationAppearance.vcornerRadius) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(border, borderEffect, borderEffectIntensity, contents, hcornerRadius, subject, title, vcornerRadius, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfTextAnnotationAppearance {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
    sb.append("    borderEffect: ").append(toIndentedString(borderEffect)).append("\n");
    sb.append("    borderEffectIntensity: ").append(toIndentedString(borderEffectIntensity)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    hcornerRadius: ").append(toIndentedString(hcornerRadius)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    vcornerRadius: ").append(toIndentedString(vcornerRadius)).append("\n");
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

