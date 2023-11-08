package com.designpattern.designpattern.structural.bridge.v1;

public abstract class Bank {
  public final Account account;

  protected Bank(Account account) {
    this.account = account;
  }

  public abstract void checkAccount();
  public abstract void saveAccount();
}
