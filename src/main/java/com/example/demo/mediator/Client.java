package com.example.demo.mediator;

/**
 * @author wangle
 * @date 2018/12/24/13:44
 **/
public class Client {
    public static void main(String[] args) {
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        Storage storage = new Storage();
        Mediator mediator = new Mediator(purchase,sale,storage);

        purchase.setMediator(mediator);
        sale.setMediator(mediator);
        storage.setMediator(mediator);

        sale.mediatorMethod();
        storage.mediatorMethod();
        purchase.mediatorMethod();
    }
}
