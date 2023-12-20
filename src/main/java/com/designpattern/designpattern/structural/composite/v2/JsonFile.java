package com.designpattern.designpattern.structural.composite.v2;

public class JsonFile implements File{
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JsonFile(String name) {
    this.name = name;
  }

  @Override
  public void showFile() {
    System.out.println("Json");
  }
}
