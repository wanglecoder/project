package com.example.demo.state;

/**
 * @author wangle
 * @date 2019/1/11/10:30
 **/
public class CloseState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {
        System.out.println("门关了");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {

    }
}
