package com.designpattern.designpattern.structural.composite.v2;

import java.util.ArrayList;
import java.util.List;

public class FileCompany implements File{

  List<File> files = new ArrayList<>();


  @Override
  public void showFile() {
    files.forEach(File::showFile);
  }
}
