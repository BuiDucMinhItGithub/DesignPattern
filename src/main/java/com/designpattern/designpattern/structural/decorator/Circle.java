package com.designpattern.designpattern.structural.decorator;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Vẽ hình tròn");
    }
}
