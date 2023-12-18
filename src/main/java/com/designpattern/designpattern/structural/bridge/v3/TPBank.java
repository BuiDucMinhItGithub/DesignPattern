package com.designpattern.designpattern.structural.bridge.v3;

public class TPBank extends Bank{

  public TPBank(Account account) {
    super(account);
  }

  @Override
  void doSomething() {
    System.out.println("TPBank do something");
    account.doSomething();
  }
}
