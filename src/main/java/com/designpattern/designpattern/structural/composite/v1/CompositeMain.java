package com.designpattern.designpattern.structural.composite.v1;

public class CompositeMain {

  public static void main(String[] args) {
    Developer developer = new Developer("Minh", 12L, "DEV");
    Developer developer2 = new Developer("Hoang", 13L, "DEV2");

    Manger manager = new Manger("Viet", 124L, "MANGER");
    Manger manager2 = new Manger("Hieu", 11L, "MANAGER2");


    CompositeCompany compositeCompany = new CompositeCompany();
    compositeCompany.addEmployee(developer);
    compositeCompany.addEmployee(developer2);
    compositeCompany.addEmployee(manager);
    compositeCompany.addEmployee(manager2);

    compositeCompany.showEmployeeName();
  }

}
