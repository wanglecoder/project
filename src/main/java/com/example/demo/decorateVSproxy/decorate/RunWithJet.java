package com.example.demo.decorateVSproxy.decorate;

/**
 * @author wangle
 * @date 2019/1/15/11:44
 **/
public class RunWithJet extends Decorate {
    public RunWithJet(IRunner runner) {
        super(runner);
    }

    @Override
    public void runFast() {
        System.out.println("跑的飞起...");
    }
}
