/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="StampLine.java">
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
import com.groupdocs.cloud.signature.model.BorderLine;
import com.groupdocs.cloud.signature.model.Color;
import com.groupdocs.cloud.signature.model.SignatureFont;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Specify Stamp line properties
 */
@ApiModel(description = "Specify Stamp line properties")
public class StampLine {
  @SerializedName("height")
  private Integer height = null;

  @SerializedName("backgroundColor")
  private Color backgroundColor = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("font")
  private SignatureFont font = null;

  @SerializedName("textColor")
  private Color textColor = null;

  @SerializedName("textBottomIntent")
  private Integer textBottomIntent = null;

  /**
   * Gets or sets text repeat type
   */
  @JsonAdapter(TextRepeatTypeEnum.Adapter.class)
  public enum TextRepeatTypeEnum {
    NONE("None"),
    
    FULLTEXTREPEAT("FullTextRepeat"),
    
    REPEATWITHTRUNCATION("RepeatWithTruncation");

    private String value;

    TextRepeatTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextRepeatTypeEnum fromValue(String text) {
      for (TextRepeatTypeEnum b : TextRepeatTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextRepeatTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextRepeatTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextRepeatTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextRepeatTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("textRepeatType")
  private TextRepeatTypeEnum textRepeatType = null;

  @SerializedName("outerBorder")
  private BorderLine outerBorder = null;

  @SerializedName("innerBorder")
  private BorderLine innerBorder = null;

  @SerializedName("visible")
  private Boolean visible = null;

  public StampLine height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Gets or sets the line height on Stamp
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the line height on Stamp")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public StampLine backgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Gets or sets the background color of signature
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "Gets or sets the background color of signature")
  public Color getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public StampLine text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Gets or sets the text of stamp line
   * @return text
  **/
  @ApiModelProperty(value = "Gets or sets the text of stamp line")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public StampLine font(SignatureFont font) {
    this.font = font;
    return this;
  }

   /**
   * Get or set Font of Stamp Line text
   * @return font
  **/
  @ApiModelProperty(value = "Get or set Font of Stamp Line text")
  public SignatureFont getFont() {
    return font;
  }

  public void setFont(SignatureFont font) {
    this.font = font;
  }

  public StampLine textColor(Color textColor) {
    this.textColor = textColor;
    return this;
  }

   /**
   * Gets or sets the text color of signature
   * @return textColor
  **/
  @ApiModelProperty(value = "Gets or sets the text color of signature")
  public Color getTextColor() {
    return textColor;
  }

  public void setTextColor(Color textColor) {
    this.textColor = textColor;
  }

  public StampLine textBottomIntent(Integer textBottomIntent) {
    this.textBottomIntent = textBottomIntent;
    return this;
  }

   /**
   * Gets or sets the bottom intent of text
   * @return textBottomIntent
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the bottom intent of text")
  public Integer getTextBottomIntent() {
    return textBottomIntent;
  }

  public void setTextBottomIntent(Integer textBottomIntent) {
    this.textBottomIntent = textBottomIntent;
  }

  public StampLine textRepeatType(TextRepeatTypeEnum textRepeatType) {
    this.textRepeatType = textRepeatType;
    return this;
  }

   /**
   * Gets or sets text repeat type
   * @return textRepeatType
  **/
  @ApiModelProperty(required = true, value = "Gets or sets text repeat type")
  public TextRepeatTypeEnum getTextRepeatType() {
    return textRepeatType;
  }

  public void setTextRepeatType(TextRepeatTypeEnum textRepeatType) {
    this.textRepeatType = textRepeatType;
  }

  public StampLine outerBorder(BorderLine outerBorder) {
    this.outerBorder = outerBorder;
    return this;
  }

   /**
   * Setup Outer Border
   * @return outerBorder
  **/
  @ApiModelProperty(value = "Setup Outer Border")
  public BorderLine getOuterBorder() {
    return outerBorder;
  }

  public void setOuterBorder(BorderLine outerBorder) {
    this.outerBorder = outerBorder;
  }

  public StampLine innerBorder(BorderLine innerBorder) {
    this.innerBorder = innerBorder;
    return this;
  }

   /**
   * Setup Internal Border
   * @return innerBorder
  **/
  @ApiModelProperty(value = "Setup Internal Border")
  public BorderLine getInnerBorder() {
    return innerBorder;
  }

  public void setInnerBorder(BorderLine innerBorder) {
    this.innerBorder = innerBorder;
  }

  public StampLine visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Get and set visibility of Stamp Line
   * @return visible
  **/
  @ApiModelProperty(required = true, value = "Get and set visibility of Stamp Line")
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StampLine stampLine = (StampLine) o;
    return Objects.equals(this.height, stampLine.height) &&
        Objects.equals(this.backgroundColor, stampLine.backgroundColor) &&
        Objects.equals(this.text, stampLine.text) &&
        Objects.equals(this.font, stampLine.font) &&
        Objects.equals(this.textColor, stampLine.textColor) &&
        Objects.equals(this.textBottomIntent, stampLine.textBottomIntent) &&
        Objects.equals(this.textRepeatType, stampLine.textRepeatType) &&
        Objects.equals(this.outerBorder, stampLine.outerBorder) &&
        Objects.equals(this.innerBorder, stampLine.innerBorder) &&
        Objects.equals(this.visible, stampLine.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, backgroundColor, text, font, textColor, textBottomIntent, textRepeatType, outerBorder, innerBorder, visible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StampLine {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    textBottomIntent: ").append(toIndentedString(textBottomIntent)).append("\n");
    sb.append("    textRepeatType: ").append(toIndentedString(textRepeatType)).append("\n");
    sb.append("    outerBorder: ").append(toIndentedString(outerBorder)).append("\n");
    sb.append("    innerBorder: ").append(toIndentedString(innerBorder)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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

