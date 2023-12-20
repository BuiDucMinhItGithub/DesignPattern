package com.designpattern.designpattern.structural.bridge.v4;

public class Main {

  public static void main(String[] args) {
    Shape circle = new Circle(new Blue());
    circle.draw();

    Shape rectangle = new Rectangle(new Red());
    rectangle.draw();
  }
}
