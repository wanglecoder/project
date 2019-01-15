package com.example.demo.decorateVSadapter.decorate;

/**
 * @author wangle
 * @date 2019/1/15/14:09
 **/
public class FlyDecorate extends Decorate {

    public FlyDecorate(Swan swan) {
        super(swan);
    }

    @Override
    public void fly() {
        System.out.println("飞得高");
    }

    @Override
    public void beatiful() {
        swan.beatiful();
    }
}
