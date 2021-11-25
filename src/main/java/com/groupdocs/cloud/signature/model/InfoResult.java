/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="InfoResult.java">
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
import com.groupdocs.cloud.signature.model.FileInfo;
import com.groupdocs.cloud.signature.model.PageInfo;
import com.groupdocs.cloud.signature.model.Signature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Document info result
 */
@ApiModel(description = "Document info result")
public class InfoResult {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  @SerializedName("extension")
  private String extension = null;

  @SerializedName("fileFormat")
  private String fileFormat = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("pagesCount")
  private Integer pagesCount = null;

  @SerializedName("dateCreated")
  private OffsetDateTime dateCreated = null;

  @SerializedName("dateModified")
  private OffsetDateTime dateModified = null;

  @SerializedName("widthForMaxHeight")
  private Integer widthForMaxHeight = null;

  @SerializedName("maxPageHeight")
  private Integer maxPageHeight = null;

  @SerializedName("pages")
  private List<PageInfo> pages = null;

  @SerializedName("signatures")
  private List<Signature> signatures = null;

  public InfoResult fileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

   /**
   * Input File info
   * @return fileInfo
  **/
  @ApiModelProperty(value = "Input File info")
  public FileInfo getFileInfo() {
    return fileInfo;
  }

  public void setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
  }

  public InfoResult extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Document extension
   * @return extension
  **/
  @ApiModelProperty(value = "Document extension")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public InfoResult fileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * Document file format
   * @return fileFormat
  **/
  @ApiModelProperty(value = "Document file format")
  public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public InfoResult size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Document size in bytes
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Document size in bytes")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public InfoResult pagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
    return this;
  }

   /**
   * Count of pages in document
   * @return pagesCount
  **/
  @ApiModelProperty(required = true, value = "Count of pages in document")
  public Integer getPagesCount() {
    return pagesCount;
  }

  public void setPagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
  }

  public InfoResult dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Document created date
   * @return dateCreated
  **/
  @ApiModelProperty(required = true, value = "Document created date")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public InfoResult dateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Document modification date
   * @return dateModified
  **/
  @ApiModelProperty(required = true, value = "Document modification date")
  public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }

  public InfoResult widthForMaxHeight(Integer widthForMaxHeight) {
    this.widthForMaxHeight = widthForMaxHeight;
    return this;
  }

   /**
   * Specifies width for max height of document page
   * @return widthForMaxHeight
  **/
  @ApiModelProperty(required = true, value = "Specifies width for max height of document page")
  public Integer getWidthForMaxHeight() {
    return widthForMaxHeight;
  }

  public void setWidthForMaxHeight(Integer widthForMaxHeight) {
    this.widthForMaxHeight = widthForMaxHeight;
  }

  public InfoResult maxPageHeight(Integer maxPageHeight) {
    this.maxPageHeight = maxPageHeight;
    return this;
  }

   /**
   * Specifies max page height
   * @return maxPageHeight
  **/
  @ApiModelProperty(required = true, value = "Specifies max page height")
  public Integer getMaxPageHeight() {
    return maxPageHeight;
  }

  public void setMaxPageHeight(Integer maxPageHeight) {
    this.maxPageHeight = maxPageHeight;
  }

  public InfoResult pages(List<PageInfo> pages) {
    this.pages = pages;
    return this;
  }

  public InfoResult addPagesItem(PageInfo pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<PageInfo>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * List of document pages descriptions
   * @return pages
  **/
  @ApiModelProperty(value = "List of document pages descriptions")
  public List<PageInfo> getPages() {
    return pages;
  }

  public void setPages(List<PageInfo> pages) {
    this.pages = pages;
  }

  public InfoResult signatures(List<Signature> signatures) {
    this.signatures = signatures;
    return this;
  }

  public InfoResult addSignaturesItem(Signature signaturesItem) {
    if (this.signatures == null) {
      this.signatures = new ArrayList<Signature>();
    }
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * Collection of document signatures
   * @return signatures
  **/
  @ApiModelProperty(value = "Collection of document signatures")
  public List<Signature> getSignatures() {
    return signatures;
  }

  public void setSignatures(List<Signature> signatures) {
    this.signatures = signatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoResult infoResult = (InfoResult) o;
    return Objects.equals(this.fileInfo, infoResult.fileInfo) &&
        Objects.equals(this.extension, infoResult.extension) &&
        Objects.equals(this.fileFormat, infoResult.fileFormat) &&
        Objects.equals(this.size, infoResult.size) &&
        Objects.equals(this.pagesCount, infoResult.pagesCount) &&
        Objects.equals(this.dateCreated, infoResult.dateCreated) &&
        Objects.equals(this.dateModified, infoResult.dateModified) &&
        Objects.equals(this.widthForMaxHeight, infoResult.widthForMaxHeight) &&
        Objects.equals(this.maxPageHeight, infoResult.maxPageHeight) &&
        Objects.equals(this.pages, infoResult.pages) &&
        Objects.equals(this.signatures, infoResult.signatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, extension, fileFormat, size, pagesCount, dateCreated, dateModified, widthForMaxHeight, maxPageHeight, pages, signatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoResult {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    widthForMaxHeight: ").append(toIndentedString(widthForMaxHeight)).append("\n");
    sb.append("    maxPageHeight: ").append(toIndentedString(maxPageHeight)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
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

