package com.designpattern.designpattern.structural.decorator.v2;

public class KetchupPizza extends PizzaDecorator{

  public KetchupPizza(IPizza pizza) {
    super(pizza);
  }

  @Override
  public String doPizza() {
    return mPizza.doPizza()+addKetchup();
  }

  private String addKetchup() {
    return "+ Ketchup";
  }
}
