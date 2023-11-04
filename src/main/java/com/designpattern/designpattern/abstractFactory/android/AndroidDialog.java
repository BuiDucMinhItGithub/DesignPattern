package com.designpattern.designpattern.abstractFactory.android;

import com.designpattern.designpattern.abstractFactory.Dialog;

public class AndroidDialog implements Dialog {
    @Override
    public void paint() {
        System.out.println("Android Dialog");
    }
}
