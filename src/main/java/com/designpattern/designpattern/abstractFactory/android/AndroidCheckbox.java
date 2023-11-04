package com.designpattern.designpattern.abstractFactory.android;

import com.designpattern.designpattern.abstractFactory.Checkbox;

public class AndroidCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Android Checkbox");
    }
}
