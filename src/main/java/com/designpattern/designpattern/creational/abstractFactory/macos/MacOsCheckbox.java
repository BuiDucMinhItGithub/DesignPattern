package com.designpattern.designpattern.creational.abstractFactory.macos;

import com.designpattern.designpattern.creational.abstractFactory.Checkbox;

public class MacOsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOs Checkbox");
    }
}
