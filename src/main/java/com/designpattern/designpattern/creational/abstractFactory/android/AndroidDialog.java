package com.designpattern.designpattern.creational.abstractFactory.android;

import com.designpattern.designpattern.creational.abstractFactory.Dialog;

public class AndroidDialog implements Dialog {
    @Override
    public void paint() {
        System.out.println("Android Dialog");
    }
}
