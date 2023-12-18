package com.designpattern.designpattern.structural.bridge.v4;

public class Circle extends Shape{

  protected Circle(Color color) {
    super(color);
  }

  @Override
  void draw() {
    System.out.println("Circle");
    color.draw();
  }
}
