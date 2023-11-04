package com.designpattern.designpattern.prototype;

public class MainPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        Pen pen = new Pen("Hong ha", 123.0, 2000);
        Pen pen1 = pen.clone();

        System.out.println("Pen original");
        System.out.println(pen.toString());
        System.out.println("Pen clone");
        System.out.println(pen1.toString());
        if (pen.equals(pen1)){
            System.out.println("Equal the same");
        }

        if (pen.hashCode() == pen1.hashCode()){
            System.out.println("Hash code the same");
        }
    }
}
