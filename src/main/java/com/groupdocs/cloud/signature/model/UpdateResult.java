/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="UpdateResult.java">
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
import com.groupdocs.cloud.signature.model.Signature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Update result information
 */
@ApiModel(description = "Update result information")
public class UpdateResult {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("succeeded")
  private List<Signature> succeeded = null;

  @SerializedName("failed")
  private List<Signature> failed = null;

  public UpdateResult fileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

   /**
   * Updated document file info
   * @return fileInfo
  **/
  @ApiModelProperty(value = "Updated document file info")
  public FileInfo getFileInfo() {
    return fileInfo;
  }

  public void setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
  }

  public UpdateResult size(Long size) {
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

  public UpdateResult succeeded(List<Signature> succeeded) {
    this.succeeded = succeeded;
    return this;
  }

  public UpdateResult addSucceededItem(Signature succeededItem) {
    if (this.succeeded == null) {
      this.succeeded = new ArrayList<Signature>();
    }
    this.succeeded.add(succeededItem);
    return this;
  }

   /**
   * List of successfully modified signatures
   * @return succeeded
  **/
  @ApiModelProperty(value = "List of successfully modified signatures")
  public List<Signature> getSucceeded() {
    return succeeded;
  }

  public void setSucceeded(List<Signature> succeeded) {
    this.succeeded = succeeded;
  }

  public UpdateResult failed(List<Signature> failed) {
    this.failed = failed;
    return this;
  }

  public UpdateResult addFailedItem(Signature failedItem) {
    if (this.failed == null) {
      this.failed = new ArrayList<Signature>();
    }
    this.failed.add(failedItem);
    return this;
  }

   /**
   * List of signatures that were not updated
   * @return failed
  **/
  @ApiModelProperty(value = "List of signatures that were not updated")
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
    UpdateResult updateResult = (UpdateResult) o;
    return Objects.equals(this.fileInfo, updateResult.fileInfo) &&
        Objects.equals(this.size, updateResult.size) &&
        Objects.equals(this.succeeded, updateResult.succeeded) &&
        Objects.equals(this.failed, updateResult.failed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, size, succeeded, failed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateResult {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

