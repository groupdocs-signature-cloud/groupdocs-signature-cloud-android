/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ImageAppearance.java">
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
import com.groupdocs.cloud.signature.model.SignatureAppearance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describes extended appearance features for Image Signature.
 */
@ApiModel(description = "Describes extended appearance features for Image Signature.")
public class ImageAppearance extends SignatureAppearance {
  @SerializedName("brightness")
  private Double brightness = null;

  @SerializedName("contrast")
  private Double contrast = null;

  @SerializedName("gammaCorrection")
  private Double gammaCorrection = null;

  @SerializedName("grayscale")
  private Boolean grayscale = null;

  public ImageAppearance brightness(Double brightness) {
    this.brightness = brightness;
    return this;
  }

   /**
   * Gets or sets image brightness. Default value is 1 it corresponds to original brightness of image.
   * @return brightness
  **/
  @ApiModelProperty(required = true, value = "Gets or sets image brightness. Default value is 1 it corresponds to original brightness of image.")
  public Double getBrightness() {
    return brightness;
  }

  public void setBrightness(Double brightness) {
    this.brightness = brightness;
  }

  public ImageAppearance contrast(Double contrast) {
    this.contrast = contrast;
    return this;
  }

   /**
   * Gets or sets image contrast. Default value is 1 it corresponds to original contrast of image.
   * @return contrast
  **/
  @ApiModelProperty(required = true, value = "Gets or sets image contrast. Default value is 1 it corresponds to original contrast of image.")
  public Double getContrast() {
    return contrast;
  }

  public void setContrast(Double contrast) {
    this.contrast = contrast;
  }

  public ImageAppearance gammaCorrection(Double gammaCorrection) {
    this.gammaCorrection = gammaCorrection;
    return this;
  }

   /**
   * Gets or sets image gamma. Default value is 1 it corresponds to original gamma of image.
   * @return gammaCorrection
  **/
  @ApiModelProperty(required = true, value = "Gets or sets image gamma. Default value is 1 it corresponds to original gamma of image.")
  public Double getGammaCorrection() {
    return gammaCorrection;
  }

  public void setGammaCorrection(Double gammaCorrection) {
    this.gammaCorrection = gammaCorrection;
  }

  public ImageAppearance grayscale(Boolean grayscale) {
    this.grayscale = grayscale;
    return this;
  }

   /**
   * Setup this flag to true if gray-scale filter is required.
   * @return grayscale
  **/
  @ApiModelProperty(required = true, value = "Setup this flag to true if gray-scale filter is required.")
  public Boolean getGrayscale() {
    return grayscale;
  }

  public void setGrayscale(Boolean grayscale) {
    this.grayscale = grayscale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageAppearance imageAppearance = (ImageAppearance) o;
    return Objects.equals(this.brightness, imageAppearance.brightness) &&
        Objects.equals(this.contrast, imageAppearance.contrast) &&
        Objects.equals(this.gammaCorrection, imageAppearance.gammaCorrection) &&
        Objects.equals(this.grayscale, imageAppearance.grayscale) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brightness, contrast, gammaCorrection, grayscale, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageAppearance {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    brightness: ").append(toIndentedString(brightness)).append("\n");
    sb.append("    contrast: ").append(toIndentedString(contrast)).append("\n");
    sb.append("    gammaCorrection: ").append(toIndentedString(gammaCorrection)).append("\n");
    sb.append("    grayscale: ").append(toIndentedString(grayscale)).append("\n");
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

