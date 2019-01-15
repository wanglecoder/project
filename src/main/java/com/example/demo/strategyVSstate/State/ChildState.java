package com.example.demo.strategyVSstate.State;

/**
 * @author wangle
 * @date 2019/1/15/17:19
 **/
public class ChildState extends HumanState {
    public ChildState(Human human) {
        super(human);
    }

    @Override
    public void dowork() {
        System.out.println("拼命玩");
        setHumanState();
    }

    @Override
    public void setHumanState() {
        human.setHumanState(human.adultState);
    }
}
