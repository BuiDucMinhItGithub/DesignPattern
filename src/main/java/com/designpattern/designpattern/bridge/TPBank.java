package com.designpattern.designpattern.bridge;

public class TPBank extends Bank{

  protected TPBank(Account account) {
    super(account);
  }

  @Override
  public void openAccount() {
    System.out.println("Open account TPBank");
  }

  @Override
  public void saveAccount() {
    System.out.println("Save account TPBank");
  }
}
