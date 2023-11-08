package com.designpattern.designpattern.bridge.v2;



public abstract class Shape {
  protected Render renderer;

  public Shape(Render renderer) {
    this.renderer = renderer;
  }

  public abstract String getName();
}
