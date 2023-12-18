package com.designpattern.designpattern.structural.bridge.v3;

public class Main {

  public static void main(String[] args) {
    Bank TPBank = new TPBank(new SavingAccount());
    TPBank.doSomething();

  }

}
