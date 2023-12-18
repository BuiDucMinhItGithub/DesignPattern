package com.designpattern.designpattern.structural.composite.v1;

public class Developer implements Employee{
  private String name;
  private long empId;
  private String position;

  public Developer(String name, long empId, String position) {
    this.name = name;
    this.empId = empId;
    this.position = position;
  }

  @Override
  public void showEmployeeName() {
    System.out.println("Developer"+ name);
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
}
