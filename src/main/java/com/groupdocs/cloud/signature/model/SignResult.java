/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SignResult.java">
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
import com.groupdocs.cloud.signature.model.Signature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Sign result information
 */
@ApiModel(description = "Sign result information")
public class SignResult {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("downloadUrl")
  private String downloadUrl = null;

  @SerializedName("succeeded")
  private List<Signature> succeeded = null;

  @SerializedName("failed")
  private List<Signature> failed = null;

  public SignResult fileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

   /**
   * Signed file info
   * @return fileInfo
  **/
  @ApiModelProperty(value = "Signed file info")
  public FileInfo getFileInfo() {
    return fileInfo;
  }

  public void setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
  }

  public SignResult size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Source document size in bytes
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Source document size in bytes")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public SignResult downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * ULR to retrieve signed file
   * @return downloadUrl
  **/
  @ApiModelProperty(value = "ULR to retrieve signed file")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public SignResult succeeded(List<Signature> succeeded) {
    this.succeeded = succeeded;
    return this;
  }

  public SignResult addSucceededItem(Signature succeededItem) {
    if (this.succeeded == null) {
      this.succeeded = new ArrayList<Signature>();
    }
    this.succeeded.add(succeededItem);
    return this;
  }

   /**
   * List of newly created signatures
   * @return succeeded
  **/
  @ApiModelProperty(value = "List of newly created signatures")
  public List<Signature> getSucceeded() {
    return succeeded;
  }

  public void setSucceeded(List<Signature> succeeded) {
    this.succeeded = succeeded;
  }

  public SignResult failed(List<Signature> failed) {
    this.failed = failed;
    return this;
  }

  public SignResult addFailedItem(Signature failedItem) {
    if (this.failed == null) {
      this.failed = new ArrayList<Signature>();
    }
    this.failed.add(failedItem);
    return this;
  }

   /**
   * List of signatures that were failed to create
   * @return failed
  **/
  @ApiModelProperty(value = "List of signatures that were failed to create")
  public List<Signature> getFailed() {
    return failed;
  }

  public void setFailed(List<Signature> failed) {
    this.failed = failed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignResult signResult = (SignResult) o;
    return Objects.equals(this.fileInfo, signResult.fileInfo) &&
        Objects.equals(this.size, signResult.size) &&
        Objects.equals(this.downloadUrl, signResult.downloadUrl) &&
        Objects.equals(this.succeeded, signResult.succeeded) &&
        Objects.equals(this.failed, signResult.failed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, size, downloadUrl, succeeded, failed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignResult {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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

