package com.designpattern.designpattern.structural.decorator.v1;

public class DecoratorMain {

  public static void main(String[] args) {
    Circle circle = new Circle();
    ColorDecoratorCircle colorDecorator = new ColorDecoratorCircle(circle, "red");
    colorDecorator.draw();
  }

}
