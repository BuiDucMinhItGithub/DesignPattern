package com.designpattern.designpattern.creational.abstractFactory.v2;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        UIFactory uiFactory = ManagerFactory.createUIFactory(UIType.MAC);
        uiFactory.createButton();
        uiFactory.createIcon();
    }
}
