package com.designpattern.designpattern.structural.composite.v1;

import java.util.ArrayList;
import java.util.List;

public class CompositeCompany implements Employee{

  private List<Employee> employeeList = new ArrayList<Employee>();

  @Override
  public void showEmployeeName() {
    for (Employee employee : employeeList) {
      employee.showEmployeeName();
    }
  }

  public void addEmployee(Employee emp)
  {
    employeeList.add(emp);
  }

  public void removeEmployee(Employee emp)
  {
    employeeList.remove(emp);
  }
}
