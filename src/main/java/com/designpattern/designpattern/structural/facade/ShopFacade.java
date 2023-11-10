package com.designpattern.designpattern.structural.facade;

public class ShopFacade {

  private final AccountService accountService;
  private final ShippingService shippingService;
  private final PaymentService paymentService;


  public ShopFacade(AccountService accountService, ShippingService shippingService,
      PaymentService paymentService) {
    this.accountService = accountService;
    this.shippingService = shippingService;
    this.paymentService = paymentService;
  }

  public void buyProductWithFreeShip(String email){
    accountService.getAccount(email);
    paymentService.paymentByCash();
    shippingService.freeShipping();
    System.out.println("Okay");
  }

  public void buyProductWithPaymentByCardWithoutAccount(){
    paymentService.paymentByCreditCard();
    shippingService.standardShipping();
    System.out.println("Nice");
  }
}
