/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PreviewResult.java">
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
import com.groupdocs.cloud.signature.model.FileInfo;
import com.groupdocs.cloud.signature.model.PreviewPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Document preview result
 */
@ApiModel(description = "Document preview result")
public class PreviewResult {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("pagesCount")
  private Integer pagesCount = null;

  @SerializedName("pages")
  private List<PreviewPage> pages = null;

  public PreviewResult fileInfo(FileInfo fileInfo) {
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

  public PreviewResult size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Input File size
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Input File size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public PreviewResult pagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
    return this;
  }

   /**
   * Count of pages
   * @return pagesCount
  **/
  @ApiModelProperty(required = true, value = "Count of pages")
  public Integer getPagesCount() {
    return pagesCount;
  }

  public void setPagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
  }

  public PreviewResult pages(List<PreviewPage> pages) {
    this.pages = pages;
    return this;
  }

  public PreviewResult addPagesItem(PreviewPage pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<PreviewPage>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Document preview pages
   * @return pages
  **/
  @ApiModelProperty(value = "Document preview pages")
  public List<PreviewPage> getPages() {
    return pages;
  }

  public void setPages(List<PreviewPage> pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviewResult previewResult = (PreviewResult) o;
    return Objects.equals(this.fileInfo, previewResult.fileInfo) &&
        Objects.equals(this.size, previewResult.size) &&
        Objects.equals(this.pagesCount, previewResult.pagesCount) &&
        Objects.equals(this.pages, previewResult.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, size, pagesCount, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviewResult {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

