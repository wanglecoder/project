package com.example.demo.commandVSstrategy.command;

/**
 * @author wangle
 * @date 2019/1/15/16:13
 **/
public class ZipUncompress extends Command {
    @Override
    public boolean execute(String resource, String target) {
        super.zipReciever.uncompress(resource,target);
        return false;
    }
}
