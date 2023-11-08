package com.designpattern.designpattern.creational.factory;

public class MainFactory {
    public static void main(String[] args) {
        Teacher mathTeacher = Factory.createTeacher(TeacherType.MATH);
        System.out.println(mathTeacher.createTeacher());
        System.out.println("----------------------------------------");
        Teacher historyTeacher = Factory.createTeacher(TeacherType.HISTORY);
        System.out.println(historyTeacher.createTeacher());
        System.out.println("----------------------------------------");
        Teacher artTeacher = Factory.createTeacher(TeacherType.ART);
        System.out.println(artTeacher.createTeacher());
    }
}
