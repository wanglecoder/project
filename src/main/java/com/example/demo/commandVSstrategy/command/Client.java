package com.example.demo.commandVSstrategy.command;

/**
 * @author wangle
 * @date 2019/1/15/15:17
 **/
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new ZipCompressCmd());
        invoker.execute("windows","c盘");
    }
}
