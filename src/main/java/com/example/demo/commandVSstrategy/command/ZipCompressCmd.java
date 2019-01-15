package com.example.demo.commandVSstrategy.command;

/**
 * @author wangle
 * @date 2019/1/15/16:13
 **/
public class ZipCompressCmd extends Command {
    @Override
    public boolean execute(String resource, String target) {
        super.zipReciever.compress(resource,target);
        return false;
    }
}
