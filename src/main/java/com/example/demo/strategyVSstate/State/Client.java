package com.example.demo.strategyVSstate.State;

/**
 * @author wangle
 * @date 2019/1/15/17:17
 **/
public class Client {
    public static void main(String[] args) {
        Human human  = new Human();
        human.setHumanState(new ChildState(human));
        human.dowork();
        human.dowork();
        human.dowork();
    }
}
