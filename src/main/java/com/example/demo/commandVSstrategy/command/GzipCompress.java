package com.example.demo.commandVSstrategy.command;

/**
 * @author wangle
 * @date 2019/1/15/16:14
 **/
public class GzipCompress extends Command {
    @Override
    public boolean execute(String resource, String target) {
        super.gzipReciever.compress(resource,target);
        return false;
    }
}
