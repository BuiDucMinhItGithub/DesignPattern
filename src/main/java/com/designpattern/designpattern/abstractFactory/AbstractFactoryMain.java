package com.designpattern.designpattern.abstractFactory;

public class AbstractFactoryMain {

    public static void main(String[] args) throws IllegalAccessException {
        UIFactory macUiFactory = FactoryManager.createUIFactory(UIType.MAC);
        UIApplication uiApplication = new UIApplication(macUiFactory);
        uiApplication.paint();
    }
}
