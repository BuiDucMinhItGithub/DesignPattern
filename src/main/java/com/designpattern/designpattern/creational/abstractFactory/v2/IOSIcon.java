package com.designpattern.designpattern.creational.abstractFactory.v2;

public class IOSIcon implements IconFactory{
    @Override
    public void displayIcon() {
        System.out.println("Display IOS Icon");
    }
}
