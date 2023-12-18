package com.designpattern.designpattern.structural.bridge.v4;

public abstract class Shape {

  public final Color color;

  protected Shape(Color color) {
    this.color = color;
  }

  abstract void draw();

}
