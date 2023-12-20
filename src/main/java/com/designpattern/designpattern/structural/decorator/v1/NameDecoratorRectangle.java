package com.designpattern.designpattern.structural.decorator.v1;

public class NameDecoratorRectangle extends Rectangle{
  private final Rectangle rectangle;
  private final String name;

  public NameDecoratorRectangle(Rectangle rectangle, String name) {
    this.rectangle = rectangle;
    this.name = name;
  }

  public Rectangle getRectangle() {
    return rectangle;
  }

  public String getName() {
    return name;
  }

  @Override
  public void draw() {
    rectangle.draw();
    System.out.println("Add name for rectangle"+ name);
  }
}
