package com.designpattern.designpattern.bridge.v1;

public class BridgeMain {

  public static void main(String[] args) {
    Bank tpBank = new TPBank(new OperateAccount());
    tpBank.checkAccount();
    tpBank.saveAccount();
  }

}
