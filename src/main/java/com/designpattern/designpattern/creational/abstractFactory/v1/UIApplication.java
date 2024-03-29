package com.designpattern.designpattern.creational.abstractFactory.v1;

public class UIApplication {
    private Dialog dialog;
    private Checkbox checkbox;

    public UIApplication(UIFactory uiFactory) {
        this.dialog = uiFactory.createDialog();
        this.checkbox = uiFactory.createCheckbox();
    }

    public void paint(){
        dialog.paint();
        checkbox.paint();
    }
}
