/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfDigitalSignatureAppearance.java">
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
import com.groupdocs.cloud.signature.model.Color;
import com.groupdocs.cloud.signature.model.SignatureAppearance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describes appearance of Digital Signature are on PDF documents.
 */
@ApiModel(description = "Describes appearance of Digital Signature are on PDF documents.")
public class PdfDigitalSignatureAppearance extends SignatureAppearance {
  @SerializedName("background")
  private Color background = null;

  @SerializedName("contactInfoLabel")
  private String contactInfoLabel = null;

  @SerializedName("dateSignedAtLabel")
  private String dateSignedAtLabel = null;

  @SerializedName("digitalSignedLabel")
  private String digitalSignedLabel = null;

  @SerializedName("fontFamilyName")
  private String fontFamilyName = null;

  @SerializedName("fontSize")
  private Double fontSize = null;

  @SerializedName("locationLabel")
  private String locationLabel = null;

  @SerializedName("reasonLabel")
  private String reasonLabel = null;

  public PdfDigitalSignatureAppearance background(Color background) {
    this.background = background;
    return this;
  }

   /**
   * Get or set background color of signature appearance. By default the value is SystemColors.Windows
   * @return background
  **/
  @ApiModelProperty(value = "Get or set background color of signature appearance. By default the value is SystemColors.Windows")
  public Color getBackground() {
    return background;
  }

  public void setBackground(Color background) {
    this.background = background;
  }

  public PdfDigitalSignatureAppearance contactInfoLabel(String contactInfoLabel) {
    this.contactInfoLabel = contactInfoLabel;
    return this;
  }

   /**
   * Gets or sets contact info label. Default value: \&quot;Contact\&quot;. if this value is empty then no contact label will appear on digital signature area.             
   * @return contactInfoLabel
  **/
  @ApiModelProperty(value = "Gets or sets contact info label. Default value: \"Contact\". if this value is empty then no contact label will appear on digital signature area.             ")
  public String getContactInfoLabel() {
    return contactInfoLabel;
  }

  public void setContactInfoLabel(String contactInfoLabel) {
    this.contactInfoLabel = contactInfoLabel;
  }

  public PdfDigitalSignatureAppearance dateSignedAtLabel(String dateSignedAtLabel) {
    this.dateSignedAtLabel = dateSignedAtLabel;
    return this;
  }

   /**
   * Gets or sets date signed label. Default value: \&quot;Date\&quot;.
   * @return dateSignedAtLabel
  **/
  @ApiModelProperty(value = "Gets or sets date signed label. Default value: \"Date\".")
  public String getDateSignedAtLabel() {
    return dateSignedAtLabel;
  }

  public void setDateSignedAtLabel(String dateSignedAtLabel) {
    this.dateSignedAtLabel = dateSignedAtLabel;
  }

  public PdfDigitalSignatureAppearance digitalSignedLabel(String digitalSignedLabel) {
    this.digitalSignedLabel = digitalSignedLabel;
    return this;
  }

   /**
   * Gets or sets digital signed label. Default value: \&quot;Digitally signed by\&quot;.
   * @return digitalSignedLabel
  **/
  @ApiModelProperty(value = "Gets or sets digital signed label. Default value: \"Digitally signed by\".")
  public String getDigitalSignedLabel() {
    return digitalSignedLabel;
  }

  public void setDigitalSignedLabel(String digitalSignedLabel) {
    this.digitalSignedLabel = digitalSignedLabel;
  }

  public PdfDigitalSignatureAppearance fontFamilyName(String fontFamilyName) {
    this.fontFamilyName = fontFamilyName;
    return this;
  }

   /**
   * Gets or sets the Font family name to display the labels. Default value is \&quot;Arial\&quot;.
   * @return fontFamilyName
  **/
  @ApiModelProperty(value = "Gets or sets the Font family name to display the labels. Default value is \"Arial\".")
  public String getFontFamilyName() {
    return fontFamilyName;
  }

  public void setFontFamilyName(String fontFamilyName) {
    this.fontFamilyName = fontFamilyName;
  }

  public PdfDigitalSignatureAppearance fontSize(Double fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Gets or sets the Font size to display the labels. Default value is 10.
   * @return fontSize
  **/
  @ApiModelProperty(value = "Gets or sets the Font size to display the labels. Default value is 10.")
  public Double getFontSize() {
    return fontSize;
  }

  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  public PdfDigitalSignatureAppearance locationLabel(String locationLabel) {
    this.locationLabel = locationLabel;
    return this;
  }

   /**
   * Gets or sets location label. Default value: \&quot;Location\&quot;. if this value is empty then no location label will appear on digital signature area.
   * @return locationLabel
  **/
  @ApiModelProperty(value = "Gets or sets location label. Default value: \"Location\". if this value is empty then no location label will appear on digital signature area.")
  public String getLocationLabel() {
    return locationLabel;
  }

  public void setLocationLabel(String locationLabel) {
    this.locationLabel = locationLabel;
  }

  public PdfDigitalSignatureAppearance reasonLabel(String reasonLabel) {
    this.reasonLabel = reasonLabel;
    return this;
  }

   /**
   * Gets or sets reason label. Default value: \&quot;Reason\&quot;. if this value is empty then no reason label will appear on digital signature area.
   * @return reasonLabel
  **/
  @ApiModelProperty(value = "Gets or sets reason label. Default value: \"Reason\". if this value is empty then no reason label will appear on digital signature area.")
  public String getReasonLabel() {
    return reasonLabel;
  }

  public void setReasonLabel(String reasonLabel) {
    this.reasonLabel = reasonLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfDigitalSignatureAppearance pdfDigitalSignatureAppearance = (PdfDigitalSignatureAppearance) o;
    return Objects.equals(this.background, pdfDigitalSignatureAppearance.background) &&
        Objects.equals(this.contactInfoLabel, pdfDigitalSignatureAppearance.contactInfoLabel) &&
        Objects.equals(this.dateSignedAtLabel, pdfDigitalSignatureAppearance.dateSignedAtLabel) &&
        Objects.equals(this.digitalSignedLabel, pdfDigitalSignatureAppearance.digitalSignedLabel) &&
        Objects.equals(this.fontFamilyName, pdfDigitalSignatureAppearance.fontFamilyName) &&
        Objects.equals(this.fontSize, pdfDigitalSignatureAppearance.fontSize) &&
        Objects.equals(this.locationLabel, pdfDigitalSignatureAppearance.locationLabel) &&
        Objects.equals(this.reasonLabel, pdfDigitalSignatureAppearance.reasonLabel) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(background, contactInfoLabel, dateSignedAtLabel, digitalSignedLabel, fontFamilyName, fontSize, locationLabel, reasonLabel, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfDigitalSignatureAppearance {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    contactInfoLabel: ").append(toIndentedString(contactInfoLabel)).append("\n");
    sb.append("    dateSignedAtLabel: ").append(toIndentedString(dateSignedAtLabel)).append("\n");
    sb.append("    digitalSignedLabel: ").append(toIndentedString(digitalSignedLabel)).append("\n");
    sb.append("    fontFamilyName: ").append(toIndentedString(fontFamilyName)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    locationLabel: ").append(toIndentedString(locationLabel)).append("\n");
    sb.append("    reasonLabel: ").append(toIndentedString(reasonLabel)).append("\n");
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

