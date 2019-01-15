package com.example.demo.commandVSstrategy.strategy;

/**
 * @author wangle
 * @date 2019/1/15/15:04
 **/
public class Gzip implements Strategy {
    @Override
    public boolean compress(String resource, String target) {
        System.out.println("Gzip压缩"+resource+"=>"+target);
        return true;
    }

    @Override
    public boolean uncompress(String resource, String target) {
        System.out.println("Gzip压缩"+resource+"=>"+target);
        return true;
    }
}
