package com.designpattern.designpattern.structural.bridge.v3;

public class CheckingAccount implements Account{

  @Override
  public void doSomething() {
    System.out.println("Checking account");
  }
}
