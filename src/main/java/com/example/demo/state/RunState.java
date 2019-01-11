package com.example.demo.state;

/**
 * @author wangle
 * @date 2019/1/11/10:31
 **/
public class RunState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("正在运行");
    }

    @Override
    public void stop() {

    }
}
