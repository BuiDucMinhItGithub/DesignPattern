package com.designpattern.designpattern.creational.singlteton.v2;

public class LazyLogger {
    private static LazyLogger INSTANCE;

    private LazyLogger(){

    }

    public static LazyLogger getINSTANCE() {
        if (INSTANCE == null){
            INSTANCE = new LazyLogger();
        }
        return INSTANCE;
    }
}
