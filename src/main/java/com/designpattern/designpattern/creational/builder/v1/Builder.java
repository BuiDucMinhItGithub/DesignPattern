package com.designpattern.designpattern.creational.builder.v1;

public interface Builder {
    public Builder getName(String name);
    public Builder getBrand(String brand);
    public Builder getRam(int ram);
    public Builder getPrice(double price);
    public Builder getYear(int year);

    Computer build();
}
