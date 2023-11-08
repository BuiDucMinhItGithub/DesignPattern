package com.designpattern.designpattern.bridge.v1;

public class VPBank extends Bank{

  protected VPBank(Account account) {
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
