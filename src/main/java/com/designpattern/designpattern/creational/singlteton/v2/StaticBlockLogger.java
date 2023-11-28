package com.designpattern.designpattern.creational.singlteton.v2;

public class StaticBlockLogger {
    private static final StaticBlockLogger INSTANCE;

    private StaticBlockLogger(){

    }

    static {
        try {
            INSTANCE = new StaticBlockLogger();
        } catch (Exception ex){
            throw new RuntimeException("Can not create instance");
        }
    }

    public static StaticBlockLogger getINSTANCE() {
        return INSTANCE;
    }
}
