package com.example.demo.strategyVSstate.Strategy;

/**
 * @author wangle
 * @date 2019/1/15/17:07
 **/
public class AdultStrategy implements Strategy {
    @Override
    public void dowork() {
        System.out.println("拼命工作");
    }
}
