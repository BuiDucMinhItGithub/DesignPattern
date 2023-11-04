package com.designpattern.designpattern.abstractFactory.macos;

import com.designpattern.designpattern.abstractFactory.Checkbox;
import com.designpattern.designpattern.abstractFactory.Dialog;
import com.designpattern.designpattern.abstractFactory.UIFactory;

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
