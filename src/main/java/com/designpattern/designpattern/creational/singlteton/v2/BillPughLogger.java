package com.designpattern.designpattern.creational.singlteton.v2;

public class BillPughLogger {

    private BillPughLogger(){

    }

    private static class BillPughHepper{
        private static final BillPughLogger INSTANCE = new BillPughLogger();
    }

    public static BillPughLogger getInstance(){
        return BillPughHepper.INSTANCE;
    }
}
