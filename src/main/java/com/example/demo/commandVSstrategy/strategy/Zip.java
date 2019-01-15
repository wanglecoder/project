package com.example.demo.commandVSstrategy.strategy;

/**
 * @author wangle
 * @date 2019/1/15/15:02
 **/
public class Zip implements Strategy {
    @Override
    public boolean compress(String resource, String target) {
        System.out.println("zip压缩"+resource+"=>"+target);
        return true;
    }

    @Override
    public boolean uncompress(String resource, String target) {
        System.out.println("zip解压"+resource+"=>"+target);
        return true;
    }
}
