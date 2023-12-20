package com.designpattern.designpattern.structural.facade.v2;

public class ShopFacade {
    private final AccountService accountService;
    private final ShippingService shippingService;

    public ShopFacade(AccountService accountService, ShippingService shippingService) {
        this.accountService = accountService;
        this.shippingService = shippingService;
    }

    public void registerAndFreeShip(){
        accountService.register();
        shippingService.freeShip();
    }

    public void loginAndFastest(){
        accountService.login();
        shippingService.fastest();
    }
}
