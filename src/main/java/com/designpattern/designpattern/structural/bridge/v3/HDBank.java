package com.designpattern.designpattern.structural.bridge.v3;

public class HDBank extends Bank{

  protected HDBank(Account account) {
    super(account);
  }

  @Override
  void doSomething() {
    System.out.println("HDBank do something");
  }
}
