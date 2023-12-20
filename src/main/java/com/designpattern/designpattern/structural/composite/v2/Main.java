package com.designpattern.designpattern.structural.composite.v2;


public class Main {

  public static void main(String[] args) {
    JsonFile jsonFile = new JsonFile("JSON file");
    PDFFile pdfFile = new PDFFile("PDF file");


    FileCompany fileCompany = new FileCompany();
    fileCompany.files.add(jsonFile);
    fileCompany.files.add(pdfFile);

    fileCompany.showFile();

  }

}
