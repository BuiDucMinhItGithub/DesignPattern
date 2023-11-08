package com.designpattern.designpattern.creational.prototype;

import java.util.Objects;

public class Pen implements Cloneable{
    private String name;
    private double price;
    private int year;

    public Pen() {
    }

    public Pen(String name, double price, int year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    protected Pen clone() throws CloneNotSupportedException {
        try {
            return (Pen) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Double.compare(pen.price, price) == 0 && year == pen.year && Objects.equals(name, pen.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, year);
    }
}
