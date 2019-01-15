package com.example.demo.commandVSstrategy.command;

/**
 * @author wangle
 * @date 2019/1/15/15:59
 **/
public class ZipReciever implements IReciever {
    @Override
    public boolean compress(String resource, String target) {
        System.out.println("zip压缩"+resource+"=>"+target);
        return false;
    }

    @Override
    public boolean uncompress(String resource, String target) {
        System.out.println("zip解压缩"+resource+"=>"+target);
        return false;
    }
}
