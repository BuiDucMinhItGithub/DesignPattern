package com.designpattern.designpattern.structural.flyweight;

public class MediumBrush implements Brush {

  final BrushSize brushSize = BrushSize.MEDIUM;

  private String color = null;

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void draw(String content) {
    System.out.println("Drawing '" + content + "' in medium color : " + color);
  }

}
