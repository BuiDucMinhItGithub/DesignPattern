package com.designpattern.designpattern.factory;

public class ArtTeacher implements Teacher{
    @Override
    public String createTeacher() {
        return "Art Teacher";
    }
}
