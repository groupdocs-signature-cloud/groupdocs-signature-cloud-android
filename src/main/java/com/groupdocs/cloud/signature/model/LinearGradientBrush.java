/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="LinearGradientBrush.java">
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
import com.groupdocs.cloud.signature.model.Brush;
import com.groupdocs.cloud.signature.model.Color;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents linear gradient brush
 */
@ApiModel(description = "Represents linear gradient brush")
public class LinearGradientBrush extends Brush {
  @SerializedName("startColor")
  private Color startColor = null;

  @SerializedName("endColor")
  private Color endColor = null;

  @SerializedName("angle")
  private Double angle = null;

  public LinearGradientBrush startColor(Color startColor) {
    this.startColor = startColor;
    return this;
  }

   /**
   * Gets or sets start gradient color
   * @return startColor
  **/
  @ApiModelProperty(value = "Gets or sets start gradient color")
  public Color getStartColor() {
    return startColor;
  }

  public void setStartColor(Color startColor) {
    this.startColor = startColor;
  }

  public LinearGradientBrush endColor(Color endColor) {
    this.endColor = endColor;
    return this;
  }

   /**
   * Gets or sets finish gradient color
   * @return endColor
  **/
  @ApiModelProperty(value = "Gets or sets finish gradient color")
  public Color getEndColor() {
    return endColor;
  }

  public void setEndColor(Color endColor) {
    this.endColor = endColor;
  }

  public LinearGradientBrush angle(Double angle) {
    this.angle = angle;
    return this;
  }

   /**
   * Gets or sets gradient angle
   * @return angle
  **/
  @ApiModelProperty(required = true, value = "Gets or sets gradient angle")
  public Double getAngle() {
    return angle;
  }

  public void setAngle(Double angle) {
    this.angle = angle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinearGradientBrush linearGradientBrush = (LinearGradientBrush) o;
    return Objects.equals(this.startColor, linearGradientBrush.startColor) &&
        Objects.equals(this.endColor, linearGradientBrush.endColor) &&
        Objects.equals(this.angle, linearGradientBrush.angle) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startColor, endColor, angle, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinearGradientBrush {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startColor: ").append(toIndentedString(startColor)).append("\n");
    sb.append("    endColor: ").append(toIndentedString(endColor)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
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

