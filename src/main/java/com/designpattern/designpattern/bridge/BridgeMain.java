package com.designpattern.designpattern.bridge;

public class BridgeMain {

  public static void main(String[] args) {
    Bank tpBank = new TPBank(new OperateAccount());
    tpBank.openAccount();
    tpBank.saveAccount();
  }

}
