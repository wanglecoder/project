package com.example.demo.strategyVSstate.Strategy;

/**
 * @author wangle
 * @date 2019/1/15/17:06
 **/
public class ChildStrategy implements Strategy {
    @Override
    public void dowork() {
        System.out.println("玩");
    }
}
