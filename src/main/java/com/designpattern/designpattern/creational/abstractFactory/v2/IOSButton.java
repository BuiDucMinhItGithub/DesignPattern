package com.designpattern.designpattern.creational.abstractFactory.v2;

public class IOSButton implements ButtonFactory{
    @Override
    public void renderButton() {
        System.out.println("Render IOS Button");
    }
}
