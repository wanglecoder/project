package com.example.demo.state;

/**
 * @author wangle
 * @date 2019/1/11/10:11
 * 上下文,封装
 **/
public class Context {
    public static final OpenState openState = new OpenState();
    public static final CloseState closeState = new CloseState();
    public static final RunState runState  = new RunState();
    public static final StopState stopState = new StopState();
    //互相引用
    private LiftState liftState;

    LiftState getLiftState(){
        return liftState;
    }

    void setLiftState(LiftState state){
        this.liftState = state;
        liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }
    public void close(){
        this.liftState.close();
    }
    public void run(){
        this.liftState.run();
    }
    public void stop(){
        this.liftState.stop();
    }
}
