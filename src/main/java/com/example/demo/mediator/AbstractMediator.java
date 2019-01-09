package com.example.demo.mediator;

/**
 * @author wangle
 * @date 2018/12/24/11:48
 * 抽象的中介者类
 **/
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Storage storage;

    public AbstractMediator(Purchase purchase, Sale sale, Storage storage) {
        this.purchase = purchase;
        this.sale = sale;
        this.storage = storage;
    }

    protected abstract void doSomething(String type,Object object);
}
