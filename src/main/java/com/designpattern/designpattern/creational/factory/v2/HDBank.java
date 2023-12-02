package com.designpattern.designpattern.creational.factory.v2;

public class HDBank implements Bank{
    @Override
    public void getBankName() {
        System.out.println("HDBank");
    }
}
