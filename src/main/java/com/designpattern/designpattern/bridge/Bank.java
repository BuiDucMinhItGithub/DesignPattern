package com.designpattern.designpattern.bridge;

public abstract class Bank {
  public final Account account;

  protected Bank(Account account) {
    this.account = account;
  }

  public abstract void openAccount();
  public abstract void saveAccount();
}
