/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
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

package com.groupdocs.cloud.signature.api;

import com.groupdocs.cloud.signature.model.FileInfo;

public class TestFile
{
    public String path;

    public String extension;

    public String fileFormat;

    public int maxPageHeight;

    public int maxPageWidth;

    public int pagesCount;

    public int size;

    public String password;

    public String getPath(){
        return this.path;
    }

    public void setPath(String path){
        this.path = path;
    }

    public String getExtension(){
        return this.extension;
    }

    public void setExtension(String extension){
        this.extension = extension;
    }

    public String getFileFormat(){
        return this.fileFormat;
    }

    public void setFileFormat(String fileFormat){
        this.fileFormat = fileFormat;
    }
    
    public int getMaxPageHeight(){
        return this.maxPageHeight;
    }

    public void setMaxPageHeight(int maxPageHeight){
        this.maxPageHeight = maxPageHeight;
    }

    public int getMaxPageWidth(){
        return this.maxPageWidth;
    }

    public void setMaxPageWidth(int maxPageWidth){
        this.maxPageWidth = maxPageWidth;
    }

    public int getPagesCount(){
        return this.pagesCount;
    }

    public void setPagesCount(int pagesCount){
        this.pagesCount = pagesCount;
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }    

    public FileInfo ToFileInfo()
    {
        FileInfo result = new FileInfo();
        result.setFilePath(this.path);
        result.setPassword(this.password);
        return result;
    }
}