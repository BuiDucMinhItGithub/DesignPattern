package com.designpattern.designpattern.creational.abstractFactory.v1.macos;

import com.designpattern.designpattern.creational.abstractFactory.v1.Dialog;

public class MacOsDialog implements Dialog {
    @Override
    public void paint() {
        System.out.println("MacOs Dialog");
    }
}
