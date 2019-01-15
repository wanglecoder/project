package com.example.demo.commandVSstrategy.strategy;

/**
 * @author wangle
 * @date 2019/1/15/14:58
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public boolean compress(String resource, String target) {
        return this.strategy.compress(resource, target);
    }

    public boolean uncompress(String resource, String target) {
        return this.strategy.uncompress(resource, target);
    }
}
