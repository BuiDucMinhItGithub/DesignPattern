package com.designpattern.designpattern.creational.abstractFactory.macos;

import com.designpattern.designpattern.creational.abstractFactory.Checkbox;
import com.designpattern.designpattern.creational.abstractFactory.Dialog;
import com.designpattern.designpattern.creational.abstractFactory.UIFactory;

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
