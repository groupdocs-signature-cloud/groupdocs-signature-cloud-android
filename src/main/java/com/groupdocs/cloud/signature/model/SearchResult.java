/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SearchResult.java">
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
import com.groupdocs.cloud.signature.model.FileInfo;
import com.groupdocs.cloud.signature.model.Signature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Search result information
 */
@ApiModel(description = "Search result information")
public class SearchResult {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("signatures")
  private List<Signature> signatures = null;

  public SearchResult fileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

   /**
   * Processed file info
   * @return fileInfo
  **/
  @ApiModelProperty(value = "Processed file info")
  public FileInfo getFileInfo() {
    return fileInfo;
  }

  public void setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
  }

  public SearchResult size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Size in bytes
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Size in bytes")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public SearchResult signatures(List<Signature> signatures) {
    this.signatures = signatures;
    return this;
  }

  public SearchResult addSignaturesItem(Signature signaturesItem) {
    if (this.signatures == null) {
      this.signatures = new ArrayList<Signature>();
    }
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * List of document signatures that were found during search
   * @return signatures
  **/
  @ApiModelProperty(value = "List of document signatures that were found during search")
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
    SearchResult searchResult = (SearchResult) o;
    return Objects.equals(this.fileInfo, searchResult.fileInfo) &&
        Objects.equals(this.size, searchResult.size) &&
        Objects.equals(this.signatures, searchResult.signatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, size, signatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

