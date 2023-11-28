package com.designpattern.designpattern.creational.abstractFactory.v2;

public class AndroidButton implements ButtonFactory{

    @Override
    public void renderButton() {
        System.out.println("Render Android Button");
    }
}
