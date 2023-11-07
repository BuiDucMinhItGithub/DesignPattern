package com.designpattern.designpattern.bridge;

public class VPBank extends Bank{

  protected VPBank(Account account) {
    super(account);
  }

  @Override
  public void openAccount() {
    System.out.println("Open account VPBank");
  }

  @Override
  public void saveAccount() {
    System.out.println("Save account VPBank");
  }
}
