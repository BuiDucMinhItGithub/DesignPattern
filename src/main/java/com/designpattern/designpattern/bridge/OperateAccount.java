package com.designpattern.designpattern.bridge;

public class OperateAccount implements Account{

  @Override
  public void operateAccount() {
    System.out.println("Operate Account");
  }
}
