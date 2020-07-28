/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SignTextOptions.java">
 *   Copyright (c) 2003-2020 Aspose Pty Ltd
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
import com.groupdocs.cloud.signature.model.SignOptions;
import com.groupdocs.cloud.signature.model.SignatureFont;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Base container class for signature options data
 */
@ApiModel(description = "Base container class for signature options data")
public class SignTextOptions extends SignOptions {
  @SerializedName("left")
  private Integer left = null;

  @SerializedName("top")
  private Integer top = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  /**
   * Measure type (pixels or percent) for Left and Top properties
   */
  @JsonAdapter(LocationMeasureTypeEnum.Adapter.class)
  public enum LocationMeasureTypeEnum {
    PIXELS("Pixels"),
    
    PERCENTS("Percents"),
    
    MILLIMETERS("Millimeters");

    private String value;

    LocationMeasureTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LocationMeasureTypeEnum fromValue(String text) {
      for (LocationMeasureTypeEnum b : LocationMeasureTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LocationMeasureTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LocationMeasureTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LocationMeasureTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LocationMeasureTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("locationMeasureType")
  private LocationMeasureTypeEnum locationMeasureType = null;

  /**
   * Measure type (pixels or percent) for Width and Height properties
   */
  @JsonAdapter(SizeMeasureTypeEnum.Adapter.class)
  public enum SizeMeasureTypeEnum {
    PIXELS("Pixels"),
    
    PERCENTS("Percents"),
    
    MILLIMETERS("Millimeters");

    private String value;

    SizeMeasureTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SizeMeasureTypeEnum fromValue(String text) {
      for (SizeMeasureTypeEnum b : SizeMeasureTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SizeMeasureTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SizeMeasureTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SizeMeasureTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SizeMeasureTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sizeMeasureType")
  private SizeMeasureTypeEnum sizeMeasureType = null;

  /**
   * Stretch mode on document page
   */
  @JsonAdapter(StretchEnum.Adapter.class)
  public enum StretchEnum {
    NONE("None"),
    
    PAGEWIDTH("PageWidth"),
    
    PAGEHEIGHT("PageHeight"),
    
    PAGEAREA("PageArea");

    private String value;

    StretchEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StretchEnum fromValue(String text) {
      for (StretchEnum b : StretchEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StretchEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StretchEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StretchEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StretchEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("stretch")
  private StretchEnum stretch = null;

  @SerializedName("rotationAngle")
  private Integer rotationAngle = null;

  /**
   * Horizontal alignment of signature on document page
   */
  @JsonAdapter(HorizontalAlignmentEnum.Adapter.class)
  public enum HorizontalAlignmentEnum {
    NONE("None"),
    
    LEFT("Left"),
    
    CENTER("Center"),
    
    RIGHT("Right");

    private String value;

    HorizontalAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HorizontalAlignmentEnum fromValue(String text) {
      for (HorizontalAlignmentEnum b : HorizontalAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HorizontalAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HorizontalAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HorizontalAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HorizontalAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("horizontalAlignment")
  private HorizontalAlignmentEnum horizontalAlignment = null;

  /**
   * Vertical alignment of signature on document page
   */
  @JsonAdapter(VerticalAlignmentEnum.Adapter.class)
  public enum VerticalAlignmentEnum {
    NONE("None"),
    
    TOP("Top"),
    
    CENTER("Center"),
    
    BOTTOM("Bottom");

    private String value;

    VerticalAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerticalAlignmentEnum fromValue(String text) {
      for (VerticalAlignmentEnum b : VerticalAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VerticalAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerticalAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerticalAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VerticalAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("verticalAlignment")
  private VerticalAlignmentEnum verticalAlignment = null;

  @SerializedName("margin")
  private Padding margin = null;

  /**
   * Gets or sets the measure type (pixels or percent) for Margin
   */
  @JsonAdapter(MarginMeasureTypeEnum.Adapter.class)
  public enum MarginMeasureTypeEnum {
    PIXELS("Pixels"),
    
    PERCENTS("Percents"),
    
    MILLIMETERS("Millimeters");

    private String value;

    MarginMeasureTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MarginMeasureTypeEnum fromValue(String text) {
      for (MarginMeasureTypeEnum b : MarginMeasureTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MarginMeasureTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MarginMeasureTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MarginMeasureTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MarginMeasureTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("marginMeasureType")
  private MarginMeasureTypeEnum marginMeasureType = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("font")
  private SignatureFont font = null;

  @SerializedName("foreColor")
  private Color foreColor = null;

  @SerializedName("backgroundColor")
  private Color backgroundColor = null;

  @SerializedName("backgroundBrush")
  private Brush backgroundBrush = null;

  @SerializedName("border")
  private BorderLine border = null;

  /**
   * Horizontal alignment of text inside a signature
   */
  @JsonAdapter(TextHorizontalAlignmentEnum.Adapter.class)
  public enum TextHorizontalAlignmentEnum {
    LEFT("Left"),
    
    CENTER("Center"),
    
    RIGHT("Right");

    private String value;

    TextHorizontalAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextHorizontalAlignmentEnum fromValue(String text) {
      for (TextHorizontalAlignmentEnum b : TextHorizontalAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextHorizontalAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextHorizontalAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextHorizontalAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextHorizontalAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("textHorizontalAlignment")
  private TextHorizontalAlignmentEnum textHorizontalAlignment = null;

  /**
   * Vertical alignment of text inside a signature
   */
  @JsonAdapter(TextVerticalAlignmentEnum.Adapter.class)
  public enum TextVerticalAlignmentEnum {
    TOP("Top"),
    
    CENTER("Center"),
    
    BOTTOM("Bottom");

    private String value;

    TextVerticalAlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextVerticalAlignmentEnum fromValue(String text) {
      for (TextVerticalAlignmentEnum b : TextVerticalAlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextVerticalAlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextVerticalAlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextVerticalAlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextVerticalAlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("textVerticalAlignment")
  private TextVerticalAlignmentEnum textVerticalAlignment = null;

  @SerializedName("zorder")
  private Integer zorder = null;

  public SignTextOptions left(Integer left) {
    this.left = left;
    return this;
  }

   /**
   * Left X position of Signature on Document Page in Measure values (pixels or percent see MeasureType LocationMeasureType property)
   * @return left
  **/
  @ApiModelProperty(required = true, value = "Left X position of Signature on Document Page in Measure values (pixels or percent see MeasureType LocationMeasureType property)")
  public Integer getLeft() {
    return left;
  }

  public void setLeft(Integer left) {
    this.left = left;
  }

  public SignTextOptions top(Integer top) {
    this.top = top;
    return this;
  }

   /**
   * Top Y Position of Signature on Document Page in Measure values (pixels or percent see MeasureType LocationMeasureType property)
   * @return top
  **/
  @ApiModelProperty(required = true, value = "Top Y Position of Signature on Document Page in Measure values (pixels or percent see MeasureType LocationMeasureType property)")
  public Integer getTop() {
    return top;
  }

  public void setTop(Integer top) {
    this.top = top;
  }

  public SignTextOptions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width of Signature area on Document Page in Measure values (pixels or percent see MeasureType SizeMeasureType property)
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Width of Signature area on Document Page in Measure values (pixels or percent see MeasureType SizeMeasureType property)")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public SignTextOptions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height of Signature are on Document Page in Measure values (pixels or percent see MeasureType SizeMeasureType property)
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Height of Signature are on Document Page in Measure values (pixels or percent see MeasureType SizeMeasureType property)")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public SignTextOptions locationMeasureType(LocationMeasureTypeEnum locationMeasureType) {
    this.locationMeasureType = locationMeasureType;
    return this;
  }

   /**
   * Measure type (pixels or percent) for Left and Top properties
   * @return locationMeasureType
  **/
  @ApiModelProperty(required = true, value = "Measure type (pixels or percent) for Left and Top properties")
  public LocationMeasureTypeEnum getLocationMeasureType() {
    return locationMeasureType;
  }

  public void setLocationMeasureType(LocationMeasureTypeEnum locationMeasureType) {
    this.locationMeasureType = locationMeasureType;
  }

  public SignTextOptions sizeMeasureType(SizeMeasureTypeEnum sizeMeasureType) {
    this.sizeMeasureType = sizeMeasureType;
    return this;
  }

   /**
   * Measure type (pixels or percent) for Width and Height properties
   * @return sizeMeasureType
  **/
  @ApiModelProperty(required = true, value = "Measure type (pixels or percent) for Width and Height properties")
  public SizeMeasureTypeEnum getSizeMeasureType() {
    return sizeMeasureType;
  }

  public void setSizeMeasureType(SizeMeasureTypeEnum sizeMeasureType) {
    this.sizeMeasureType = sizeMeasureType;
  }

  public SignTextOptions stretch(StretchEnum stretch) {
    this.stretch = stretch;
    return this;
  }

   /**
   * Stretch mode on document page
   * @return stretch
  **/
  @ApiModelProperty(required = true, value = "Stretch mode on document page")
  public StretchEnum getStretch() {
    return stretch;
  }

  public void setStretch(StretchEnum stretch) {
    this.stretch = stretch;
  }

  public SignTextOptions rotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
    return this;
  }

   /**
   * Rotation angle of signature on document page (clockwise)
   * @return rotationAngle
  **/
  @ApiModelProperty(required = true, value = "Rotation angle of signature on document page (clockwise)")
  public Integer getRotationAngle() {
    return rotationAngle;
  }

  public void setRotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
  }

  public SignTextOptions horizontalAlignment(HorizontalAlignmentEnum horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

   /**
   * Horizontal alignment of signature on document page
   * @return horizontalAlignment
  **/
  @ApiModelProperty(required = true, value = "Horizontal alignment of signature on document page")
  public HorizontalAlignmentEnum getHorizontalAlignment() {
    return horizontalAlignment;
  }

  public void setHorizontalAlignment(HorizontalAlignmentEnum horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
  }

  public SignTextOptions verticalAlignment(VerticalAlignmentEnum verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

   /**
   * Vertical alignment of signature on document page
   * @return verticalAlignment
  **/
  @ApiModelProperty(required = true, value = "Vertical alignment of signature on document page")
  public VerticalAlignmentEnum getVerticalAlignment() {
    return verticalAlignment;
  }

  public void setVerticalAlignment(VerticalAlignmentEnum verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }

  public SignTextOptions margin(Padding margin) {
    this.margin = margin;
    return this;
  }

   /**
   * Gets or sets the space between Sign and Document edges (works ONLY if horizontal or vertical alignment are specified)
   * @return margin
  **/
  @ApiModelProperty(value = "Gets or sets the space between Sign and Document edges (works ONLY if horizontal or vertical alignment are specified)")
  public Padding getMargin() {
    return margin;
  }

  public void setMargin(Padding margin) {
    this.margin = margin;
  }

  public SignTextOptions marginMeasureType(MarginMeasureTypeEnum marginMeasureType) {
    this.marginMeasureType = marginMeasureType;
    return this;
  }

   /**
   * Gets or sets the measure type (pixels or percent) for Margin
   * @return marginMeasureType
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the measure type (pixels or percent) for Margin")
  public MarginMeasureTypeEnum getMarginMeasureType() {
    return marginMeasureType;
  }

  public void setMarginMeasureType(MarginMeasureTypeEnum marginMeasureType) {
    this.marginMeasureType = marginMeasureType;
  }

  public SignTextOptions text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text of signature
   * @return text
  **/
  @ApiModelProperty(value = "Text of signature")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SignTextOptions font(SignatureFont font) {
    this.font = font;
    return this;
  }

   /**
   * Gets or sets the font of signature
   * @return font
  **/
  @ApiModelProperty(value = "Gets or sets the font of signature")
  public SignatureFont getFont() {
    return font;
  }

  public void setFont(SignatureFont font) {
    this.font = font;
  }

  public SignTextOptions foreColor(Color foreColor) {
    this.foreColor = foreColor;
    return this;
  }

   /**
   * Gets or sets the fore color of signature
   * @return foreColor
  **/
  @ApiModelProperty(value = "Gets or sets the fore color of signature")
  public Color getForeColor() {
    return foreColor;
  }

  public void setForeColor(Color foreColor) {
    this.foreColor = foreColor;
  }

  public SignTextOptions backgroundColor(Color backgroundColor) {
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

  public SignTextOptions backgroundBrush(Brush backgroundBrush) {
    this.backgroundBrush = backgroundBrush;
    return this;
  }

   /**
   * Gets or sets the signature background brush. Value by default is null.  If this property has a value it will be used instead BackgroundBrush property. For Spreadsheet documents TextStamp implementation RadialGradientBrush is not applicable, it is replaced by LinearGradientBrush. Spreadsheets, Images, Presentations It is not used for Watermark implementation. PDF For Stamp implementation LinearGradientBrush (ColorStart) and RadialGradientBrush (ColorInner) are used as SolidBrush. PDF It is not used for Annotation, Sticker, TextToFormField and Watermark implementations. Presentations For TextStamp implementation RadialGradientBrush is not applicable, it is replaced by LinearGradientBrush. Word Processing For TextStamp implementation LinearGradientBrush (ColorStart) and RadialGradientBrush (ColorInner) are used as SolidBrush. Word Processing It is not used for TextToFormField and Watermark implementations
   * @return backgroundBrush
  **/
  @ApiModelProperty(value = "Gets or sets the signature background brush. Value by default is null.  If this property has a value it will be used instead BackgroundBrush property. For Spreadsheet documents TextStamp implementation RadialGradientBrush is not applicable, it is replaced by LinearGradientBrush. Spreadsheets, Images, Presentations It is not used for Watermark implementation. PDF For Stamp implementation LinearGradientBrush (ColorStart) and RadialGradientBrush (ColorInner) are used as SolidBrush. PDF It is not used for Annotation, Sticker, TextToFormField and Watermark implementations. Presentations For TextStamp implementation RadialGradientBrush is not applicable, it is replaced by LinearGradientBrush. Word Processing For TextStamp implementation LinearGradientBrush (ColorStart) and RadialGradientBrush (ColorInner) are used as SolidBrush. Word Processing It is not used for TextToFormField and Watermark implementations")
  public Brush getBackgroundBrush() {
    return backgroundBrush;
  }

  public void setBackgroundBrush(Brush backgroundBrush) {
    this.backgroundBrush = backgroundBrush;
  }

  public SignTextOptions border(BorderLine border) {
    this.border = border;
    return this;
  }

   /**
   * Gets or sets the signature border properties
   * @return border
  **/
  @ApiModelProperty(value = "Gets or sets the signature border properties")
  public BorderLine getBorder() {
    return border;
  }

  public void setBorder(BorderLine border) {
    this.border = border;
  }

  public SignTextOptions textHorizontalAlignment(TextHorizontalAlignmentEnum textHorizontalAlignment) {
    this.textHorizontalAlignment = textHorizontalAlignment;
    return this;
  }

   /**
   * Horizontal alignment of text inside a signature
   * @return textHorizontalAlignment
  **/
  @ApiModelProperty(required = true, value = "Horizontal alignment of text inside a signature")
  public TextHorizontalAlignmentEnum getTextHorizontalAlignment() {
    return textHorizontalAlignment;
  }

  public void setTextHorizontalAlignment(TextHorizontalAlignmentEnum textHorizontalAlignment) {
    this.textHorizontalAlignment = textHorizontalAlignment;
  }

  public SignTextOptions textVerticalAlignment(TextVerticalAlignmentEnum textVerticalAlignment) {
    this.textVerticalAlignment = textVerticalAlignment;
    return this;
  }

   /**
   * Vertical alignment of text inside a signature
   * @return textVerticalAlignment
  **/
  @ApiModelProperty(required = true, value = "Vertical alignment of text inside a signature")
  public TextVerticalAlignmentEnum getTextVerticalAlignment() {
    return textVerticalAlignment;
  }

  public void setTextVerticalAlignment(TextVerticalAlignmentEnum textVerticalAlignment) {
    this.textVerticalAlignment = textVerticalAlignment;
  }

  public SignTextOptions zorder(Integer zorder) {
    this.zorder = zorder;
    return this;
  }

   /**
   * Gets or sets the Z-order position of text signature. Determines the display order of overlapping signatures.             
   * @return zorder
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the Z-order position of text signature. Determines the display order of overlapping signatures.             ")
  public Integer getZorder() {
    return zorder;
  }

  public void setZorder(Integer zorder) {
    this.zorder = zorder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignTextOptions signTextOptions = (SignTextOptions) o;
    return Objects.equals(this.left, signTextOptions.left) &&
        Objects.equals(this.top, signTextOptions.top) &&
        Objects.equals(this.width, signTextOptions.width) &&
        Objects.equals(this.height, signTextOptions.height) &&
        Objects.equals(this.locationMeasureType, signTextOptions.locationMeasureType) &&
        Objects.equals(this.sizeMeasureType, signTextOptions.sizeMeasureType) &&
        Objects.equals(this.stretch, signTextOptions.stretch) &&
        Objects.equals(this.rotationAngle, signTextOptions.rotationAngle) &&
        Objects.equals(this.horizontalAlignment, signTextOptions.horizontalAlignment) &&
        Objects.equals(this.verticalAlignment, signTextOptions.verticalAlignment) &&
        Objects.equals(this.margin, signTextOptions.margin) &&
        Objects.equals(this.marginMeasureType, signTextOptions.marginMeasureType) &&
        Objects.equals(this.text, signTextOptions.text) &&
        Objects.equals(this.font, signTextOptions.font) &&
        Objects.equals(this.foreColor, signTextOptions.foreColor) &&
        Objects.equals(this.backgroundColor, signTextOptions.backgroundColor) &&
        Objects.equals(this.backgroundBrush, signTextOptions.backgroundBrush) &&
        Objects.equals(this.border, signTextOptions.border) &&
        Objects.equals(this.textHorizontalAlignment, signTextOptions.textHorizontalAlignment) &&
        Objects.equals(this.textVerticalAlignment, signTextOptions.textVerticalAlignment) &&
        Objects.equals(this.zorder, signTextOptions.zorder) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, top, width, height, locationMeasureType, sizeMeasureType, stretch, rotationAngle, horizontalAlignment, verticalAlignment, margin, marginMeasureType, text, font, foreColor, backgroundColor, backgroundBrush, border, textHorizontalAlignment, textVerticalAlignment, zorder, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignTextOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    locationMeasureType: ").append(toIndentedString(locationMeasureType)).append("\n");
    sb.append("    sizeMeasureType: ").append(toIndentedString(sizeMeasureType)).append("\n");
    sb.append("    stretch: ").append(toIndentedString(stretch)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
    sb.append("    horizontalAlignment: ").append(toIndentedString(horizontalAlignment)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    marginMeasureType: ").append(toIndentedString(marginMeasureType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    foreColor: ").append(toIndentedString(foreColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    backgroundBrush: ").append(toIndentedString(backgroundBrush)).append("\n");
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
    sb.append("    textHorizontalAlignment: ").append(toIndentedString(textHorizontalAlignment)).append("\n");
    sb.append("    textVerticalAlignment: ").append(toIndentedString(textVerticalAlignment)).append("\n");
    sb.append("    zorder: ").append(toIndentedString(zorder)).append("\n");
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

