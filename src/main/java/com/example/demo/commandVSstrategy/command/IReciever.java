package com.example.demo.commandVSstrategy.command;

/**
 * @author wangle
 * @date 2019/1/15/15:57
 **/
public interface IReciever {
    boolean compress(String resource,String target);
    boolean uncompress(String resource,String target);
}
