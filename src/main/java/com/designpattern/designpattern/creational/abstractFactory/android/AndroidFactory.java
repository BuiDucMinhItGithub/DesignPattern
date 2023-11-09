package com.designpattern.designpattern.creational.abstractFactory.android;

import com.designpattern.designpattern.creational.abstractFactory.Checkbox;
import com.designpattern.designpattern.creational.abstractFactory.Dialog;
import com.designpattern.designpattern.creational.abstractFactory.UIFactory;

public class AndroidFactory implements UIFactory {
    @Override
    public Dialog createDialog() {
        return new AndroidDialog();
    }

    @Override
    public Checkbox createCheckbox() {
        return new AndroidCheckbox();
    }
}
