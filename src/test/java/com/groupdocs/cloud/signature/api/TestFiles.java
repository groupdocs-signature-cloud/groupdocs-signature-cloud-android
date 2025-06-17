/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
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

package com.groupdocs.cloud.signature.api;

import java.util.ArrayList;

public class TestFiles {

    public static String CommonPassword = "1234567890";

    public static ArrayList<TestFile> AllFiles;

    public static ArrayList<TestFile> ImageStorage;
    public static ArrayList<TestFile> ImageStorageSigned;
    public static ArrayList<TestFile> PdfStorage;
    public static ArrayList<TestFile> PdfStorageSigned;
    public static ArrayList<TestFile> PresentationStorage;
    public static ArrayList<TestFile> PresentationStorageSigned;    
    public static ArrayList<TestFile> SpreadsheetStorage;
    public static ArrayList<TestFile> SpreadsheetStorageSigned;    
    public static ArrayList<TestFile> WordProcessingStorage;
    public static ArrayList<TestFile> WordProcessingStorageSigned;        
    public static ArrayList<TestFile> AdditionalStorage;        
    
    public static TestFile NotExist = new TestFile() {{ path = "some-folder\\NotExist.docx"; }};

    static {

        //Images
        ImageStorage = new ArrayList<TestFile>();
        ImageStorage.add(new TestFile() {{path ="Images\\01_pages.jpg"; extension = "jpg"; fileFormat = "JPEG Image"; maxPageHeight = 1000; maxPageWidth = 1000; pagesCount = 1; size = 90269;}});
        ImageStorage.add(new TestFile() {{path ="Images\\01_pages.png"; extension = "png"; fileFormat = "Portable Network Graphic"; maxPageHeight = 1000; maxPageWidth = 1000; pagesCount = 1; size = 11011;}});

        ImageStorageSigned = new ArrayList<TestFile>();
        ImageStorageSigned.add(new TestFile() {{path ="Signed\\SignedForVerificationAll.png"; extension = "png"; fileFormat = "Portable Network Graphic"; size = 27533;}});

        //Pdf
        PdfStorage = new ArrayList<TestFile>();
        PdfStorage.add(new TestFile() {{path ="Pdf\\01_pages.pdf"; extension = "pdf"; fileFormat = "Portable Document Format File"; maxPageHeight = 792; maxPageWidth = 612; pagesCount = 1; size = 55321;}});
        PdfStorage.add(new TestFile() {{path ="Pdf\\01_pages_pwd.pdf"; extension = "pdf"; fileFormat = "Portable Document Format File"; maxPageHeight = 792; maxPageWidth = 612; pagesCount = 1; size = 94273; password = CommonPassword;}});
        PdfStorage.add(new TestFile() {{path ="Pdf\\02_pages.pdf"; extension = "pdf"; fileFormat = "Portable Document Format File"; maxPageHeight = 841; maxPageWidth = 595; pagesCount = 2; size = 396944;}});

        PdfStorageSigned = new ArrayList<TestFile>();
        PdfStorageSigned.add(new TestFile() {{path ="Signed\\SignedForVerificationAll.pdf"; extension = "pdf"; fileFormat = "Portable Document Format File"; size = 164060;}});

        //Presentation
        PresentationStorage = new ArrayList<TestFile>();
        PresentationStorage.add(new TestFile() {{path ="Presentations\\01_pages.pptx"; extension = "pptx"; fileFormat = "PowerPoint Open XML Presentation"; maxPageHeight = 540; maxPageWidth = 720; pagesCount = 1; size = 42146;}});
        PresentationStorage.add(new TestFile() {{path ="Presentations\\01_pages_pwd.pptx"; extension = "pptx"; fileFormat = "PowerPoint Open XML Presentation"; maxPageHeight = 540; maxPageWidth = 720; pagesCount = 1; size = 38912; password = CommonPassword;}});
        PresentationStorage.add(new TestFile() {{path ="Presentations\\02_pages.pptx"; extension = "pptx"; fileFormat = "PowerPoint Open XML Presentation"; maxPageHeight = 540; maxPageWidth = 720; pagesCount = 2; size = 51673;}});

        PresentationStorageSigned = new ArrayList<TestFile>();
        PresentationStorageSigned.add(new TestFile() {{path ="Signed\\SignedForVerificationAll.pptx"; extension = "pptx"; fileFormat = "PowerPoint Open XML Presentation"; size = 43205;}});

        //Spreadsheets
        SpreadsheetStorage = new ArrayList<TestFile>();
        SpreadsheetStorage.add(new TestFile() {{path ="Spreadsheets\\01_pages.xlsx"; extension = "xlsx"; fileFormat = "Microsoft Excel Open XML Spreadsheet"; maxPageHeight = 637; maxPageWidth = 765; pagesCount = 1; size = 12260;}});
        SpreadsheetStorage.add(new TestFile() {{path ="Spreadsheets\\01_pages_pwd.xlsx"; extension = "xlsx"; fileFormat = "Microsoft Excel Open XML Spreadsheet"; maxPageHeight = 1424; maxPageWidth = 1165; pagesCount = 1; size = 1001472; password = CommonPassword;}});
        SpreadsheetStorage.add(new TestFile() {{path ="Spreadsheets\\02_pages.xlsx"; extension = "xlsx"; fileFormat = "Microsoft Excel Open XML Spreadsheet"; maxPageHeight = 846; maxPageWidth = 867; pagesCount = 2; size = 22396;}});

        SpreadsheetStorageSigned = new ArrayList<TestFile>();
        SpreadsheetStorageSigned.add(new TestFile() {{path ="Signed\\SignedForVerificationAll.xlsx"; extension = "xlsx"; fileFormat = "Microsoft Excel Open XML Spreadsheet"; size = 318157;}});

        //WordProcessing
        WordProcessingStorage = new ArrayList<TestFile>();
        WordProcessingStorage.add(new TestFile() {{path ="WordProcessing\\01_pages.docx"; extension = "docx"; fileFormat = "Microsoft Word Open XML Document"; maxPageHeight = 792; maxPageWidth = 612; pagesCount = 1; size = 1359584;}});
        WordProcessingStorage.add(new TestFile() {{path ="WordProcessing\\01_pages_pwd.docx"; extension = "docx"; fileFormat = "Microsoft Word Open XML Document"; maxPageHeight = 792; maxPageWidth = 612; pagesCount = 1; size = 1069568; password = CommonPassword;}});
        WordProcessingStorage.add(new TestFile() {{path ="WordProcessing\\02_pages.docx"; extension = "docx"; fileFormat = "Microsoft Word Open XML Document"; maxPageHeight = 792; maxPageWidth = 612; pagesCount = 2; size = 1356395;}});

        WordProcessingStorageSigned = new ArrayList<TestFile>();
        WordProcessingStorageSigned.add(new TestFile() {{path ="Signed\\SignedForVerificationAll.docx"; extension = "docx"; fileFormat = "Microsoft Word Open XML Document"; size = 1358290;}});

        //Additional
        AdditionalStorage = new ArrayList<TestFile>();
        AdditionalStorage.add(new TestFile() {{path ="Additional\\JohnSmithSign.png";}});
        AdditionalStorage.add(new TestFile() {{path ="Additional\\SherlockHolmes.pfx";}});
        AdditionalStorage.add(new TestFile() {{path ="Additional\\signature_01.jpg";}});
        AdditionalStorage.add(new TestFile() {{path ="Additional\\signature_02.jpg";}});
        AdditionalStorage.add(new TestFile() {{path ="Additional\\signature_03.jpg";}});

        AllFiles = new ArrayList<TestFile>();
        AllFiles.addAll(ImageStorage);
        AllFiles.addAll(ImageStorageSigned);        
        AllFiles.addAll(PdfStorage);
        AllFiles.addAll(PdfStorageSigned);
        AllFiles.addAll(PresentationStorage);
        AllFiles.addAll(PresentationStorageSigned);
        AllFiles.addAll(SpreadsheetStorage);
        AllFiles.addAll(SpreadsheetStorageSigned);
        AllFiles.addAll(WordProcessingStorage);
        AllFiles.addAll(WordProcessingStorageSigned);        
        AllFiles.addAll(AdditionalStorage);     
    }

    public static ArrayList<TestFile> getAllFiles() {
        
        return AllFiles; 
    } 
}