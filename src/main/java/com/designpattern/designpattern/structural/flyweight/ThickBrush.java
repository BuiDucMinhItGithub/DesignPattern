package com.designpattern.designpattern.structural.flyweight;

public class ThickBrush implements Brush{
  final BrushSize brushSize = BrushSize.THICK;
  private String color = null;

  @Override
  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void draw(String content) {
    System.out.println("Drawing '" + content + "' in thick color : " + color);
  }
}
