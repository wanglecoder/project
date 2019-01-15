package com.example.demo.decorateVSproxy.decorate;

/**
 * @author wangle
 * @date 2019/1/15/11:45
 **/
public class Runner implements IRunner {
    @Override
    public void runFast() {
        System.out.println("一般跑...");
    }
}
