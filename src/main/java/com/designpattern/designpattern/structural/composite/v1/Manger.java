package com.designpattern.designpattern.structural.composite.v1;

public class Manger implements Employee{

  private String name;
  private long empId;
  private String position;

  @Override
  public void showEmployeeName() {
    System.out.println("Manager"+ name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getEmpId() {
    return empId;
  }

  public void setEmpId(long empId) {
    this.empId = empId;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Manger(String name, long empId, String position) {
    this.name = name;
    this.empId = empId;
    this.position = position;
  }
}
