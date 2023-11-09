package com.designpattern.designpattern.creational.factory;

public class MathTeacher implements Teacher{
    @Override
    public String createTeacher() {
        return "Math Teacher";
    }
}
