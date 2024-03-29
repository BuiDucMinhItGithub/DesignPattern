package com.designpattern.designpattern.structural.bridge.v2;

public class Triangle extends Shape{

  public Triangle(Render renderer) {
    super(renderer);
  }

  @Override
  public String getName() {
    return renderer.whatToRenderAs();
  }
}
