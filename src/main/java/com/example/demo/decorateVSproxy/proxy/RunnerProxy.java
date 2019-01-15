package com.example.demo.decorateVSproxy.proxy;

import java.util.Random;

/**
 * @author wangle
 * @date 2019/1/15/13:50
 **/
public class RunnerProxy implements IRunner {
    private IRunner runner;
    public RunnerProxy(IRunner runner){
        this.runner = runner;
    }
    @Override
    public void runFast() {
        Random random = new Random();
        if(random.nextBoolean()){
            runner.runFast();
        }else{
            System.out.println("不想跑");
        }
    }
}
