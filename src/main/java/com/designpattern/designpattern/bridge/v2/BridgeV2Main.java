package com.designpattern.designpattern.bridge.v2;

public class BridgeV2Main {

  public static void main(String[] args) {
    Render rasterRender = new RasterRender();

    Circle circle = new Circle(rasterRender);
    Triangle triangle = new Triangle(new VectorRender());
    System.out.println(circle.getName());
    System.out.println(triangle.getName());
  }

}
