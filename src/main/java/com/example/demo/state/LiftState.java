package com.example.demo.state;

/**
 * @author wangle
 * @date 2019/1/11/10:09
 **/
public abstract class LiftState {
    protected Context context;
    public void setContext(Context context){
        this.context = context;
    }
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
