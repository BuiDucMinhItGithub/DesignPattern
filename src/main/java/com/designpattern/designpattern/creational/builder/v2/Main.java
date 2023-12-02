package com.designpattern.designpattern.creational.builder.v2;

public class Main {
    public static void main(String[] args) {
        Computer computer = new ConcreteComputer().setName("Minh").setPrice(10.000).setBrand("Dell").setRam(16).build();
        System.out.println(computer);
    }
}
