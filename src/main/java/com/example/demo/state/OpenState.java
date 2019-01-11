package com.example.demo.state;

/**
 * @author wangle
 * @date 2019/1/11/10:29
 **/
public class OpenState extends LiftState {
    @Override
    public void open() {
        System.out.println("门开了");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closeState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stopState);
        super.context.getLiftState().stop();
    }
}
