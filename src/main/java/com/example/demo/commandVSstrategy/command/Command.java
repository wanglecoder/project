package com.example.demo.commandVSstrategy.command;

/**
 * @author wangle
 * @date 2019/1/15/16:05
 **/
public abstract class Command {
    protected GzipReciever gzipReciever = new GzipReciever();
    protected ZipReciever zipReciever = new ZipReciever();

    public abstract boolean execute(String resource, String target);
}
