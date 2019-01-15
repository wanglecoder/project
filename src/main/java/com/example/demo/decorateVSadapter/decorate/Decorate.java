package com.example.demo.decorateVSadapter.decorate;

/**
 * @author wangle
 * @date 2019/1/15/14:08
 **/
public abstract class Decorate implements Swan {
    protected Swan swan;

    public Decorate(Swan swan) {
        this.swan = swan;
    }

    @Override
    public abstract void fly();

    @Override
    public abstract void beatiful();
}
