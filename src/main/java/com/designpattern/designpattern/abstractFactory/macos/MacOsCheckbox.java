package com.designpattern.designpattern.abstractFactory.macos;

import com.designpattern.designpattern.abstractFactory.Checkbox;

public class MacOsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOs Checkbox");
    }
}
