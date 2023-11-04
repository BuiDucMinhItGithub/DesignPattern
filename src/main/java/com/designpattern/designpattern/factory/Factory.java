package com.designpattern.designpattern.factory;

public class Factory {

    public Factory() {
    }

    public static Teacher createTeacher(TeacherType teacherType){
        Teacher teacher;
        switch (teacherType){
            case ART -> teacher = new ArtTeacher();
            case MATH -> teacher = new MathTeacher();
            case HISTORY -> teacher = new HistoryTeacher();
            default -> throw new IllegalArgumentException("This teacher type is unsupported");
        }
        return teacher;
    }
}
