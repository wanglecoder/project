package com.example.demo.strategyVSstate.State;

/**
 * @author wangle
 * @date 2019/1/15/17:22
 **/
public class AdultState extends HumanState {
    public AdultState(Human human) {
        super(human);
    }

    @Override
    void dowork() {
        System.out.println("拼命工作");
        setHumanState();
    }

    @Override
    void setHumanState() {
        human.setHumanState(human.olderState);
    }
}
