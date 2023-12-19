package com.designpattern.designpattern.structural.decorator.v2;

public abstract class PizzaDecorator implements IPizza{

  protected IPizza mPizza;

  public PizzaDecorator(IPizza pizza) {
    mPizza = pizza;
  }

  public IPizza getPizza() {
    return mPizza;
  }

  public void setPizza(IPizza mPizza) {
    this.mPizza = mPizza;
  }


}
