package com.designpattern.designpattern.creational.abstractFactory.v2;

public class IOSFactory implements UIFactory{
    @Override
    public void createButton() {
        System.out.println("Create IOS Button");
    }

    @Override
    public void createIcon() {
        System.out.println("Create IOS Icon");
    }
}
