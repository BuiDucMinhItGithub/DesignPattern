package com.designpattern.designpattern.creational.builder.v1;

public class MainBuilder {

    public static void main(String[] args) {
        Computer computer = new ComputerBuilder().getBrand("Dell").getName("Dell Latitude")
                .getPrice(120.000).build();
        System.out.println("Name: " + computer.getName() + " Brand: " + computer.getBrand() + " Price: " +
                computer.getPrice() + " Ram:" + computer.getRam() + " Year: " + computer.getYear());
    }
}
