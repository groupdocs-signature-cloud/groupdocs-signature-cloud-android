/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfTextStickerAppearance.java">
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
import com.groupdocs.cloud.signature.model.SignatureAppearance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describes appearance of PDF text annotation sticker object and pop-up window of sticker.
 */
@ApiModel(description = "Describes appearance of PDF text annotation sticker object and pop-up window of sticker.")
public class PdfTextStickerAppearance extends SignatureAppearance {
  @SerializedName("contents")
  private String contents = null;

  /**
   * Gets or sets the icon of sticker.
   */
  @JsonAdapter(IconEnum.Adapter.class)
  public enum IconEnum {
    NOTE("Note"),
    
    COMMENT("Comment"),
    
    KEY("Key"),
    
    HELP("Help"),
    
    NEWPARAGRAPH("NewParagraph"),
    
    PARAGRAPH("Paragraph"),
    
    INSERT("Insert"),
    
    CHECK("Check"),
    
    CROSS("Cross"),
    
    CIRCLE("Circle"),
    
    STAR("Star");

    private String value;

    IconEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IconEnum fromValue(String text) {
      for (IconEnum b : IconEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IconEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IconEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IconEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IconEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("icon")
  private IconEnum icon = null;

  @SerializedName("opened")
  private Boolean opened = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("title")
  private String title = null;

  public PdfTextStickerAppearance contents(String contents) {
    this.contents = contents;
    return this;
  }

   /**
   * Gets or sets the contents of pop-up window.
   * @return contents
  **/
  @ApiModelProperty(value = "Gets or sets the contents of pop-up window.")
  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public PdfTextStickerAppearance icon(IconEnum icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Gets or sets the icon of sticker.
   * @return icon
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the icon of sticker.")
  public IconEnum getIcon() {
    return icon;
  }

  public void setIcon(IconEnum icon) {
    this.icon = icon;
  }

  public PdfTextStickerAppearance opened(Boolean opened) {
    this.opened = opened;
    return this;
  }

   /**
   * Setup if sticker pop-up window will be opened by default.
   * @return opened
  **/
  @ApiModelProperty(required = true, value = "Setup if sticker pop-up window will be opened by default.")
  public Boolean getOpened() {
    return opened;
  }

  public void setOpened(Boolean opened) {
    this.opened = opened;
  }

  public PdfTextStickerAppearance subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Gets or sets subject.
   * @return subject
  **/
  @ApiModelProperty(value = "Gets or sets subject.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public PdfTextStickerAppearance title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Gets or sets title of pop-up window.
   * @return title
  **/
  @ApiModelProperty(value = "Gets or sets title of pop-up window.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfTextStickerAppearance pdfTextStickerAppearance = (PdfTextStickerAppearance) o;
    return Objects.equals(this.contents, pdfTextStickerAppearance.contents) &&
        Objects.equals(this.icon, pdfTextStickerAppearance.icon) &&
        Objects.equals(this.opened, pdfTextStickerAppearance.opened) &&
        Objects.equals(this.subject, pdfTextStickerAppearance.subject) &&
        Objects.equals(this.title, pdfTextStickerAppearance.title) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, icon, opened, subject, title, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfTextStickerAppearance {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    opened: ").append(toIndentedString(opened)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

