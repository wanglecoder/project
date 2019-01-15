package com.example.demo.strategyVSstate.State;

/**
 * @author wangle
 * @date 2019/1/15/17:23
 **/
public class OlderState extends HumanState {
    public OlderState(Human human) {
        super(human);
    }

    @Override
    void dowork() {
        System.out.println("享乐");
    }

    @Override
    void setHumanState() {

    }
}
