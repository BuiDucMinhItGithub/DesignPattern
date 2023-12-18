package com.designpattern.designpattern.structural.composite.v2;

public class PDFFile implements File{

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PDFFile(String name) {
    this.name = name;
  }
  @Override
  public void showFile() {
    System.out.println("PDF");
  }
}
