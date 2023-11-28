package com.designpattern.designpattern.creational.abstractFactory.v1.android;

import com.designpattern.designpattern.creational.abstractFactory.v1.Checkbox;

public class AndroidCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Android Checkbox");
    }
}
