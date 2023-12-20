package com.designpattern.designpattern.structural.decorator.v1;

public class ColorDecoratorCircle extends Circle{
  private final Circle circle;
  private final String color;


  public ColorDecoratorCircle(Circle circle, String color) {
    this.circle = circle;
    this.color = color;
  }

  @Override
  public void draw() {
    circle.draw();
    System.out.println("Draw color for circle"+ color);
  }
}
