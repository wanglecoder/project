package com.example.demo.commandVSstrategy.command;

/**
 * @author wangle
 * @date 2019/1/15/16:20
 **/
public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command = command;
    }
    public boolean execute(String resource,String target){
        return this.command.execute(resource,target);
    }
}
