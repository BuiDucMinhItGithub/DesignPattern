package com.designpattern.designpattern.behavior.state;

public class DocumentContext {
  private State state;

  public void setState(State state) {
    this.state = state;
  }

  public void applyState() {
    this.state.handleRequest();
  }
}
