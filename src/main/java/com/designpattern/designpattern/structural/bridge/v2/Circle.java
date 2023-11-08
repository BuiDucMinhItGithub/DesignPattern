package com.designpattern.designpattern.structural.bridge.v2;

public class Circle extends Shape{

  public Circle(Render renderer) {
    super(renderer);
  }

  @Override
  public String getName() {
    return renderer.whatToRenderAs();
  }
}
