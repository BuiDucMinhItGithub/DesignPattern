package com.designpattern.designpattern.structural.bridge.v3;

public abstract class Bank {

  public final Account account;

  protected Bank(Account account) {
    this.account = account;
  }

  abstract void doSomething();

}
