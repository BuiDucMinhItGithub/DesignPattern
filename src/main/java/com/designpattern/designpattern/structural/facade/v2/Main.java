package com.designpattern.designpattern.structural.facade.v2;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        ShippingService shippingService = new ShippingService();
        ShopFacade shopFacade = new ShopFacade(accountService, shippingService);
        shopFacade.loginAndFastest();
        shopFacade.registerAndFreeShip();
    }
}
