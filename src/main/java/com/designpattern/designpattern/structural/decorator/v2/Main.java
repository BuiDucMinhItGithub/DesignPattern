package com.designpattern.designpattern.structural.decorator.v2;

public class Main {

  public static void main(String[] args) {
    IPizza chickenPizza = new ChickenPizza();
    IPizza seafoodPizza = new SeafoodPizza();

    PepperPizza pepperPizza = new PepperPizza(chickenPizza);
    KetchupPizza ketchupPizza = new KetchupPizza(seafoodPizza);

    System.out.println(pepperPizza.doPizza());

    System.out.println(ketchupPizza.doPizza());

  }

}
