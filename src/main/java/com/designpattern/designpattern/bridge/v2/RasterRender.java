package com.designpattern.designpattern.bridge.v2;

public class RasterRender implements Render{

  @Override
  public String whatToRenderAs() {
    return "Raster render";
  }
}
