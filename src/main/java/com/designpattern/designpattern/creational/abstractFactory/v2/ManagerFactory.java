package com.designpattern.designpattern.creational.abstractFactory.v2;


public class ManagerFactory {
    public static UIFactory createUIFactory(UIType uiType) throws IllegalAccessException {
        switch (uiType){
            case MAC -> {
                return new IOSFactory();
            }
            case ANDROID -> {
                return new AndroidFactory();
            }
            default -> throw new IllegalAccessException("Not support");
        }
    }
}
