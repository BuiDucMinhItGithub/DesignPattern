package com.designpattern.designpattern.creational.builder.v2;

public class Computer {
    private String name;
    private double price;
    private int ram;
    private String brand;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }
    public String getBrand() {
        return brand;
    }

    public Computer(String name, double price, int ram, String brand) {
        this.name = name;
        this.price = price;
        this.ram = ram;
        this.brand = brand;
    }
}
