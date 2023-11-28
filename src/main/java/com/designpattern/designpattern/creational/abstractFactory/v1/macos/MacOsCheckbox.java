package com.designpattern.designpattern.creational.abstractFactory.v1.macos;

import com.designpattern.designpattern.creational.abstractFactory.v1.Checkbox;

public class MacOsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOs Checkbox");
    }
}
