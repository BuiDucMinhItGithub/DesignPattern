package com.designpattern.designpattern.creational.singlteton.v1;

public class MainSingleton {

    public static void main(String[] args) {
        Person person = Person.getInstance();
        Person person1 = Person.getInstance();
        if (person1.equals(person)) {
            System.out.println("Unique Instance");
        }
    }
}
