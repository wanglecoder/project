package com.example.demo.strategyVSstate.Strategy;

/**
 * @author wangle
 * @date 2019/1/15/17:08
 **/
public class OlderStrategy implements Strategy{
    @Override
    public void dowork() {
        System.out.println("享乐");
    }
}
