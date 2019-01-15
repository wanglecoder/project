package com.example.demo.commandVSstrategy.strategy;

/**
 * @author wangle
 * @date 2019/1/15/14:59
 **/
public interface Strategy {
    boolean compress(String resource,String target);
    boolean uncompress(String resource,String target);
}
