package com.designpattern.designpattern.creational.builder;

public class ComputerBuilder implements Builder{

    private String name;
    private int ram;
    private String brand;
    private int year;
    private double price;

    @Override
    public Builder getName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder getBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Builder getRam(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public Builder getPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public Builder getYear(int year) {
        this.year = year;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(name, ram, brand, year, price);
    }
}
