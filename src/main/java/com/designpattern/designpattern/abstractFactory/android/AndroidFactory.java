package com.designpattern.designpattern.abstractFactory.android;

import com.designpattern.designpattern.abstractFactory.Checkbox;
import com.designpattern.designpattern.abstractFactory.Dialog;
import com.designpattern.designpattern.abstractFactory.UIFactory;

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
