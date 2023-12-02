package com.designpattern.designpattern.creational.builder.v2;

public interface ComputerBuilder {
    public ComputerBuilder setName(String name);
    public ComputerBuilder setPrice(double price);
    public ComputerBuilder setRam(int ram);
    public ComputerBuilder setBrand(String brand);

    public Computer build();
}
