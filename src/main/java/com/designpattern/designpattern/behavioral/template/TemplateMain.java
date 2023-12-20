package com.designpattern.designpattern.behavioral.template;

public class TemplateMain {
  public static void main(String[] args) {

    PageTemplate homePage = new HomePage();
    homePage.showPage();

    System.out.println();
    PageTemplate detailPage = new DetailPage();
    detailPage.showPage();

    System.out.println();
    PageTemplate contactPage = new ContentPage();
    contactPage.showPage();
  }
}
