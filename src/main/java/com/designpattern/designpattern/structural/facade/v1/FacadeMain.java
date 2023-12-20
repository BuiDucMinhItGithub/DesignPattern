package com.designpattern.designpattern.structural.facade.v1;

public class FacadeMain {

  public static void main(String[] args) {
    AccountService accountService = new AccountService();
    PaymentService paymentService = new PaymentService();
    ShippingService shippingService = new ShippingService();
    ShopFacade shopFacade = new ShopFacade(accountService, shippingService, paymentService);

    System.out.println("Mua hang free ship");
    shopFacade.buyProductWithFreeShip("minh@gmail.com");

    System.out.println("Mua hang khong can tai khoan");
    shopFacade.buyProductWithPaymentByCardWithoutAccount();
  }

}
