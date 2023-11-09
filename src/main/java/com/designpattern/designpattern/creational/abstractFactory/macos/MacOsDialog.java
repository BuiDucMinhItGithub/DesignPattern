package com.designpattern.designpattern.creational.abstractFactory.macos;

import com.designpattern.designpattern.creational.abstractFactory.Dialog;

public class MacOsDialog implements Dialog {
    @Override
    public void paint() {
        System.out.println("MacOs Dialog");
    }
}
