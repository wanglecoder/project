package com.example.demo.decorateVSproxy.decorate;

/**
 * @author wangle
 * @date 2019/1/15/11:46
 **/
public class Client {
    public static void main(String[] args) {
        IRunner runner = new Runner();
        runner.runFast();
        Decorate decorate = new RunWithJet(runner);
        decorate.runFast();
    }
}
