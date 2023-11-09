package com.designpattern.designpattern.creational.abstractFactory.android;

import com.designpattern.designpattern.creational.abstractFactory.Checkbox;

public class AndroidCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Android Checkbox");
    }
}
