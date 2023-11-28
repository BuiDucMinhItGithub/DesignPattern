package com.designpattern.designpattern.creational.singlteton.v2;

public class EagerLogger {
    private static final EagerLogger INSTANCE = new EagerLogger();

    private EagerLogger() {
    }

    public static EagerLogger getInstance(){
        return INSTANCE;
    }
}
