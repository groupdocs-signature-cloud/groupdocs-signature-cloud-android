/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="MetadataSignature.java">
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
import com.groupdocs.cloud.signature.model.Signature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Contains Metadata signature properties.
 */
@ApiModel(description = "Contains Metadata signature properties.")
public class MetadataSignature extends Signature {
  /**
   * Specifies metadata type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NONE("None"),
    
    CERTIFICATE("Certificate"),
    
    IMAGE("Image"),
    
    PDF("Pdf"),
    
    PRESENTATION("Presentation"),
    
    SPREADSHEET("Spreadsheet"),
    
    WORDPROCESSING("WordProcessing");

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

  /**
   * Specifies metadata value type.
   */
  @JsonAdapter(DataTypeEnum.Adapter.class)
  public enum DataTypeEnum {
    UNDEFINED("Undefined"),
    
    BOOLEAN("Boolean"),
    
    INTEGER("Integer"),
    
    DOUBLE("Double"),
    
    DATETIME("DateTime"),
    
    STRING("String");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataTypeEnum fromValue(String text) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DataTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("dataType")
  private DataTypeEnum dataType = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("tagPrefix")
  private String tagPrefix = null;

  public MetadataSignature type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Specifies metadata type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Specifies metadata type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MetadataSignature dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Specifies metadata value type.
   * @return dataType
  **/
  @ApiModelProperty(required = true, value = "Specifies metadata value type.")
  public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }

  public MetadataSignature value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Specifies metadata object value
   * @return value
  **/
  @ApiModelProperty(value = "Specifies metadata object value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public MetadataSignature name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies unique metadata name
   * @return name
  **/
  @ApiModelProperty(value = "Specifies unique metadata name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MetadataSignature id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of Image Metadata signature. See GroupDocs.Signature.Domain.ImageMetadataSignatures class that contains standard Signature with predefined Id value.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier of Image Metadata signature. See GroupDocs.Signature.Domain.ImageMetadataSignatures class that contains standard Signature with predefined Id value.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MetadataSignature size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Size of  Image Metadata value
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Size of  Image Metadata value")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public MetadataSignature description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description for standard Image Metadata signature
   * @return description
  **/
  @ApiModelProperty(value = "Description for standard Image Metadata signature")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MetadataSignature tagPrefix(String tagPrefix) {
    this.tagPrefix = tagPrefix;
    return this;
  }

   /**
   * The prefix tag of Pdf Metadata signature name. By default this property is set to \&quot;xmp\&quot;. Possible values are
   * @return tagPrefix
  **/
  @ApiModelProperty(value = "The prefix tag of Pdf Metadata signature name. By default this property is set to \"xmp\". Possible values are")
  public String getTagPrefix() {
    return tagPrefix;
  }

  public void setTagPrefix(String tagPrefix) {
    this.tagPrefix = tagPrefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataSignature metadataSignature = (MetadataSignature) o;
    return Objects.equals(this.type, metadataSignature.type) &&
        Objects.equals(this.dataType, metadataSignature.dataType) &&
        Objects.equals(this.value, metadataSignature.value) &&
        Objects.equals(this.name, metadataSignature.name) &&
        Objects.equals(this.id, metadataSignature.id) &&
        Objects.equals(this.size, metadataSignature.size) &&
        Objects.equals(this.description, metadataSignature.description) &&
        Objects.equals(this.tagPrefix, metadataSignature.tagPrefix) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dataType, value, name, id, size, description, tagPrefix, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataSignature {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tagPrefix: ").append(toIndentedString(tagPrefix)).append("\n");
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

