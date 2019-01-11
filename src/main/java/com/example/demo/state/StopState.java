package com.example.demo.state;

/**
 * @author wangle
 * @date 2019/1/11/10:31
 **/
public class StopState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
        System.out.println("停止运行");
    }
}
