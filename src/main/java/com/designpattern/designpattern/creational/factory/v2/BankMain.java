package com.designpattern.designpattern.creational.factory.v2;

public class BankMain {
    public static void main(String[] args) {
        Bank vpBank = FactoryBank.getBank(BankType.VPBANK);
        vpBank.getBankName();
        Bank hdBank = FactoryBank.getBank(BankType.HDBANK);
        hdBank.getBankName();
    }
}
