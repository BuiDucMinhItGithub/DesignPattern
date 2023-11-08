package com.designpattern.designpattern.structural.bridge.v1;

public class OperateAccount implements Account{

  @Override
  public void checkAccount() {
    System.out.println("Check Account");
  }

  @Override
  public void saveAccount() {
    System.out.println("Save Account");
  }
}
