package com.example.demo.decorateVSproxy.proxy;

/**
 * @author wangle
 * @date 2019/1/15/13:42
 **/
public class Client {
    public static void main(String[] args) {
        RunnerProxy runnerProxy = new RunnerProxy(new Runner());
        runnerProxy.runFast();
    }
}
