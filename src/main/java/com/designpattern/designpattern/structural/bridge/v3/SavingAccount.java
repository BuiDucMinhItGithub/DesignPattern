package com.designpattern.designpattern.structural.bridge.v3;

public class SavingAccount implements Account{

  @Override
  public void doSomething() {
    System.out.println("Saving account");
  }
}
