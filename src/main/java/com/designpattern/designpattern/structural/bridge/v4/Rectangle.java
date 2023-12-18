package com.designpattern.designpattern.structural.bridge.v4;

public class Rectangle extends Shape{

  protected Rectangle(Color color) {
    super(color);
  }

  @Override
  void draw() {
    System.out.println("Rectangle");
    color.draw();
  }
}
