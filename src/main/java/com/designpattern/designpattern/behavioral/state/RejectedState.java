package com.designpattern.designpattern.behavioral.state;

public class RejectedState implements State {

  @Override
  public void handleRequest() {
    System.out.println("Rejected");
  }

}
