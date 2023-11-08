package com.designpattern.designpattern.structural.bridge.v1;

public class TPBank extends Bank{

  protected TPBank(Account account) {
    super(account);
  }

  @Override
  public void checkAccount() {
    account.checkAccount();
  }

  @Override
  public void saveAccount() {
    account.saveAccount();
  }
}
