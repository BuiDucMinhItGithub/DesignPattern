package com.designpattern.designpattern.abstractFactory;

import com.designpattern.designpattern.abstractFactory.android.AndroidFactory;
import com.designpattern.designpattern.abstractFactory.macos.MacOsFactory;

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
