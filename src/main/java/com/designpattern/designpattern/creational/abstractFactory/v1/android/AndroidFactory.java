package com.designpattern.designpattern.creational.abstractFactory.v1.android;

import com.designpattern.designpattern.creational.abstractFactory.v1.Checkbox;
import com.designpattern.designpattern.creational.abstractFactory.v1.Dialog;
import com.designpattern.designpattern.creational.abstractFactory.v1.UIFactory;

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
