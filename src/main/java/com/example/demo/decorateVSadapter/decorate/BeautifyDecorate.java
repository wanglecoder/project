package com.example.demo.decorateVSadapter.decorate;

/**
 * @author wangle
 * @date 2019/1/15/14:11
 **/
public class BeautifyDecorate extends Decorate {
    public BeautifyDecorate(Swan swan) {
        super(swan);
    }

    @Override
    public void fly() {
        swan.fly();
    }

    @Override
    public void beatiful() {
        System.out.println("非常漂亮...");
    }
}
