package com.designpattern.designpattern.abstractFactory.macos;

import com.designpattern.designpattern.abstractFactory.Dialog;

public class MacOsDialog implements Dialog {
    @Override
    public void paint() {
        System.out.println("MacOs Dialog");
    }
}
