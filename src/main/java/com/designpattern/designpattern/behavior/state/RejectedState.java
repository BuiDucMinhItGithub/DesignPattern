package com.designpattern.designpattern.behavior.state;

public class RejectedState implements State {

  @Override
  public void handleRequest() {
    System.out.println("Rejected");
  }

}
