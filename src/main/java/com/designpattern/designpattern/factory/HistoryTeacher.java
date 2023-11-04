package com.designpattern.designpattern.factory;

public class HistoryTeacher implements Teacher{
    @Override
    public String createTeacher() {
        return "History Teacher";
    }
}
