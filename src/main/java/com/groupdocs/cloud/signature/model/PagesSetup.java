/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PagesSetup.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes special pages of document to process
 */
@ApiModel(description = "Describes special pages of document to process")
public class PagesSetup {
  @SerializedName("firstPage")
  private Boolean firstPage = null;

  @SerializedName("lastPage")
  private Boolean lastPage = null;

  @SerializedName("oddPages")
  private Boolean oddPages = null;

  @SerializedName("evenPages")
  private Boolean evenPages = null;

  @SerializedName("pageNumbers")
  private List<Integer> pageNumbers = null;

  public PagesSetup firstPage(Boolean firstPage) {
    this.firstPage = firstPage;
    return this;
  }

   /**
   * Get or set flag to use first document page
   * @return firstPage
  **/
  @ApiModelProperty(required = true, value = "Get or set flag to use first document page")
  public Boolean getFirstPage() {
    return firstPage;
  }

  public void setFirstPage(Boolean firstPage) {
    this.firstPage = firstPage;
  }

  public PagesSetup lastPage(Boolean lastPage) {
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Get or set flag to use last document page
   * @return lastPage
  **/
  @ApiModelProperty(required = true, value = "Get or set flag to use last document page")
  public Boolean getLastPage() {
    return lastPage;
  }

  public void setLastPage(Boolean lastPage) {
    this.lastPage = lastPage;
  }

  public PagesSetup oddPages(Boolean oddPages) {
    this.oddPages = oddPages;
    return this;
  }

   /**
   * Get or set flag to use odd pages of document
   * @return oddPages
  **/
  @ApiModelProperty(required = true, value = "Get or set flag to use odd pages of document")
  public Boolean getOddPages() {
    return oddPages;
  }

  public void setOddPages(Boolean oddPages) {
    this.oddPages = oddPages;
  }

  public PagesSetup evenPages(Boolean evenPages) {
    this.evenPages = evenPages;
    return this;
  }

   /**
   * Get or set flag to use even pages of document
   * @return evenPages
  **/
  @ApiModelProperty(required = true, value = "Get or set flag to use even pages of document")
  public Boolean getEvenPages() {
    return evenPages;
  }

  public void setEvenPages(Boolean evenPages) {
    this.evenPages = evenPages;
  }

  public PagesSetup pageNumbers(List<Integer> pageNumbers) {
    this.pageNumbers = pageNumbers;
    return this;
  }

  public PagesSetup addPageNumbersItem(Integer pageNumbersItem) {
    if (this.pageNumbers == null) {
      this.pageNumbers = new ArrayList<Integer>();
    }
    this.pageNumbers.add(pageNumbersItem);
    return this;
  }

   /**
   * Set arbitrary pages of document to use
   * @return pageNumbers
  **/
  @ApiModelProperty(value = "Set arbitrary pages of document to use")
  public List<Integer> getPageNumbers() {
    return pageNumbers;
  }

  public void setPageNumbers(List<Integer> pageNumbers) {
    this.pageNumbers = pageNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagesSetup pagesSetup = (PagesSetup) o;
    return Objects.equals(this.firstPage, pagesSetup.firstPage) &&
        Objects.equals(this.lastPage, pagesSetup.lastPage) &&
        Objects.equals(this.oddPages, pagesSetup.oddPages) &&
        Objects.equals(this.evenPages, pagesSetup.evenPages) &&
        Objects.equals(this.pageNumbers, pagesSetup.pageNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstPage, lastPage, oddPages, evenPages, pageNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagesSetup {\n");
    
    sb.append("    firstPage: ").append(toIndentedString(firstPage)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    oddPages: ").append(toIndentedString(oddPages)).append("\n");
    sb.append("    evenPages: ").append(toIndentedString(evenPages)).append("\n");
    sb.append("    pageNumbers: ").append(toIndentedString(pageNumbers)).append("\n");
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

