package com.designpattern.designpattern.behavioral.template;

public class HomePage extends PageTemplate {

  @Override
  protected void showBody() {
    System.out.println("Content of home page page");
  }

}
