package com.designpattern.designpattern.structural.decorator.v2;

public class PepperPizza extends PizzaDecorator {

  public PepperPizza(IPizza pizza) {
    super(pizza);
  }

  @Override
  public String doPizza() {
    return mPizza.doPizza() + addPepper();
  }


  private String addPepper() {
    return "+ Pepper";
  }

}
