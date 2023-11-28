package com.designpattern.designpattern.creational.abstractFactory.v1.macos;

import com.designpattern.designpattern.creational.abstractFactory.v1.Checkbox;
import com.designpattern.designpattern.creational.abstractFactory.v1.Dialog;
import com.designpattern.designpattern.creational.abstractFactory.v1.UIFactory;

public class MacOsFactory implements UIFactory {
    @Override
    public Dialog createDialog() {
        return new MacOsDialog();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
