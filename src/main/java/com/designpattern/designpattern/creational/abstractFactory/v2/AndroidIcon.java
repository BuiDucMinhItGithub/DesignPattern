package com.designpattern.designpattern.creational.abstractFactory.v2;

public class AndroidIcon implements IconFactory{
    @Override
    public void displayIcon() {
        System.out.println("Display Android Icon");
    }
}
