package com.designpattern.designpattern.creational.abstractFactory.v1.android;

import com.designpattern.designpattern.creational.abstractFactory.v1.Dialog;

public class AndroidDialog implements Dialog {
    @Override
    public void paint() {
        System.out.println("Android Dialog");
    }
}
