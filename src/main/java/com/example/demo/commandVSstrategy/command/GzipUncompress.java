package com.example.demo.commandVSstrategy.command;

/**
 * @author wangle
 * @date 2019/1/15/16:15
 **/
public class GzipUncompress extends Command {
    @Override
    public boolean execute(String resource, String target) {
        super.gzipReciever.uncompress(resource,target);
        return false;
    }
}
