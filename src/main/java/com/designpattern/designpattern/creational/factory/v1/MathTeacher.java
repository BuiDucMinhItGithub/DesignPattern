package com.designpattern.designpattern.creational.factory.v1;

public class MathTeacher implements Teacher{
    @Override
    public String createTeacher() {
        return "Math Teacher";
    }
}
