package com.designpattern.designpattern.creational.builder.v1;

public class Computer {
    private String name;
    private int ram;
    private String brand;
    private int year;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Computer() {
    }

    public Computer(String name, int ram, String brand, int year, double price) {
        this.name = name;
        this.ram = ram;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
}
