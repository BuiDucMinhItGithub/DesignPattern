package com.designpattern.designpattern.creational.abstractFactory.v2;

public class AndroidFactory implements UIFactory{
    @Override
    public void createButton() {
        System.out.println("Create Android Button");
    }

    @Override
    public void createIcon() {
        System.out.println("Create Android Icon");
    }
}
