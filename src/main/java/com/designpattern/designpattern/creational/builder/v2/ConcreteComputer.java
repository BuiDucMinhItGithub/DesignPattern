package com.designpattern.designpattern.creational.builder.v2;

public class ConcreteComputer implements ComputerBuilder{

    private String name;
    private String brand;
    private double price;
    private int ram;

    @Override
    public ComputerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ComputerBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputerBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(name, price, ram, brand);
    }
}
