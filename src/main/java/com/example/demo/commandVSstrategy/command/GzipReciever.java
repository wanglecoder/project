package com.example.demo.commandVSstrategy.command;

/**
 * @author wangle
 * @date 2019/1/15/16:00
 **/
public class GzipReciever implements IReciever {
    @Override
    public boolean compress(String resource, String target) {
        System.out.println("gzip压缩"+resource+"=>"+target);
        return false;
    }

    @Override
    public boolean uncompress(String resource, String target) {
        System.out.println("gzip解压缩"+resource+"=>"+target);
        return false;
    }
}
