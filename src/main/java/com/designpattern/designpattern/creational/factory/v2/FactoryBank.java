package com.designpattern.designpattern.creational.factory.v2;

public class FactoryBank {

    public FactoryBank(){

    }
 
    public static Bank getBank(BankType bankType){
        Bank bank;
        switch (bankType){
            case HDBANK -> bank = new HDBank();
            case VPBANK -> bank = new VPBank();
            default -> throw new IllegalArgumentException("This teacher type is unsupported");
        }
        return bank;
    }
}
