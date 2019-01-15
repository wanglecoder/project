package com.example.demo.strategyVSstate.State;

/**
 * @author wangle
 * @date 2019/1/15/17:17
 **/
public abstract class HumanState {
    protected Human human;

    public HumanState(Human human) {
        this.human = human;
    }

    abstract void dowork();

    abstract void setHumanState();
}
