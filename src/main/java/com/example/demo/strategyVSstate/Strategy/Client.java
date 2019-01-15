package com.example.demo.strategyVSstate.Strategy;

/**
 * @author wangle
 * @date 2019/1/15/17:05
 **/
public class Client {
    public static void main(String[] args) {
        Context context  = new Context();
        context.setStrategy(new ChildStrategy());
        context.dowork();
        context.setStrategy(new AdultStrategy());
        context.dowork();
    }
}
