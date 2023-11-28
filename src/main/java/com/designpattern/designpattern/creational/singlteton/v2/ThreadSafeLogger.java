package com.designpattern.designpattern.creational.singlteton.v2;

public class ThreadSafeLogger {
    private static volatile ThreadSafeLogger INSTANCE;

    private ThreadSafeLogger(){

    }

    public static synchronized ThreadSafeLogger getINSTANCE() {
        if (INSTANCE == null){
            INSTANCE = new ThreadSafeLogger();
        }
        return INSTANCE;
    }
}
