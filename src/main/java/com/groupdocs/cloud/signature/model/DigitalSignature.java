/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DigitalSignature.java">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
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
import com.groupdocs.cloud.signature.model.Signature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Contains digital Signature properties
 */
@ApiModel(description = "Contains digital Signature properties")
public class DigitalSignature extends Signature {
  @SerializedName("comments")
  private String comments = null;

  @SerializedName("isValid")
  private Boolean isValid = null;

  /**
   * Gets or sets the type of the digital signature
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNKNOWN("Unknown"),
    
    CRYPTOAPI("CryptoApi"),
    
    XMLDSIG("XmlDsig");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("signTime")
  private OffsetDateTime signTime = null;

  public DigitalSignature comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Gets or sets the signing purpose comment
   * @return comments
  **/
  @ApiModelProperty(value = "Gets or sets the signing purpose comment")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public DigitalSignature isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * Keeps true if this digital signature is valid and the document has not been tampered with
   * @return isValid
  **/
  @ApiModelProperty(required = true, value = "Keeps true if this digital signature is valid and the document has not been tampered with")
  public Boolean getIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public DigitalSignature type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Gets or sets the type of the digital signature
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the type of the digital signature")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public DigitalSignature signTime(OffsetDateTime signTime) {
    this.signTime = signTime;
    return this;
  }

   /**
   * Gets or sets the time the document was signed
   * @return signTime
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the time the document was signed")
  public OffsetDateTime getSignTime() {
    return signTime;
  }

  public void setSignTime(OffsetDateTime signTime) {
    this.signTime = signTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalSignature digitalSignature = (DigitalSignature) o;
    return Objects.equals(this.comments, digitalSignature.comments) &&
        Objects.equals(this.isValid, digitalSignature.isValid) &&
        Objects.equals(this.type, digitalSignature.type) &&
        Objects.equals(this.signTime, digitalSignature.signTime) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, isValid, type, signTime, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalSignature {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    signTime: ").append(toIndentedString(signTime)).append("\n");
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

