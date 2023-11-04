package com.designpattern.designpattern.factory;

public class MathTeacher implements Teacher{
    @Override
    public String createTeacher() {
        return "Math Teacher";
    }
}
