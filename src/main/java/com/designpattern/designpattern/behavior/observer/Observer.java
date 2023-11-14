package com.designpattern.designpattern.behavior.observer;

public abstract class Observer {
  protected Subject subject;
  public abstract void update();
}
