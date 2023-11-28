package com.designpattern.designpattern.creational.abstractFactory.v1;

import com.designpattern.designpattern.creational.abstractFactory.v1.android.AndroidFactory;
import com.designpattern.designpattern.creational.abstractFactory.v1.macos.MacOsFactory;

public class FactoryManager {

    public static UIFactory createUIFactory(UIType uiType) throws IllegalAccessException {
        switch (uiType){
            case MAC -> {
                return new MacOsFactory();
            }
            case ANDROID -> {
                return new AndroidFactory();
            }
            default -> throw new IllegalAccessException("Not support");
        }
    }
}
