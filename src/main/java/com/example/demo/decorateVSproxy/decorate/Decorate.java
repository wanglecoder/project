package com.example.demo.decorateVSproxy.decorate;

/**
 * @author wangle
 * @date 2019/1/15/11:39
 **/
public abstract class Decorate implements IRunner {
    protected IRunner runner;

    public Decorate(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public abstract void runFast();
}
