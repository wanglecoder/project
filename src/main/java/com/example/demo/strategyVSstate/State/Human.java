package com.example.demo.strategyVSstate.State;

/**
 * @author wangle
 * @date 2019/1/15/17:18
 **/
public class Human {
    public HumanState childState = new ChildState(this);
    public HumanState adultState = new AdultState(this);
    public HumanState olderState = new OlderState(this);
    private HumanState state;

    public void setHumanState(HumanState humanState) {
        state = humanState;
    }

    public void dowork() {
        state.dowork();
    }
}
