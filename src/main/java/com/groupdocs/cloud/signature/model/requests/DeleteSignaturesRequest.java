/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DeleteSignaturesRequest.java">
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

package com.groupdocs.cloud.signature.model.requests;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.signature.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.File;

/**
 * Request model for deleteSignatures method.
 */
public class DeleteSignaturesRequest {
    
    /**
    * Initializes a new instance of the DeleteSignaturesRequest class.
    */      
    public DeleteSignaturesRequest()
    {
    }

    /**
    * Initializes a new instance of the DeleteSignaturesRequest class.    
    * @param deleteSettings Delete signatures settings
    */
    public DeleteSignaturesRequest(DeleteSettings deleteSettings)
    {
        this.deleteSettings = deleteSettings;
    }

  @SerializedName("deleteSettings")
  private DeleteSettings deleteSettings = null;

  /**
   * Delete signatures settings
   * @return Delete signatures settings
  **/
  @ApiModelProperty(example = "new DeleteSettings()", required = true, value = "Delete signatures settings")
  public DeleteSettings getdeleteSettings() {
    return deleteSettings;
  }

  public void setdeleteSettings(DeleteSettings deleteSettings) {
    this.deleteSettings = deleteSettings;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    DeleteSignaturesRequest request = (DeleteSignaturesRequest) o;
    return Objects.equals(this.deleteSettings, request.deleteSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteSignatures {\n");
    sb.append("    deleteSettings: ").append(toIndentedString(deleteSettings)).append("\n");
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

