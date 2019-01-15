package com.example.demo.strategyVSstate.Strategy;

/**
 * @author wangle
 * @date 2019/1/15/17:06
 **/
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void dowork(){
        this.strategy.dowork();
    }
}
