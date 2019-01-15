package com.example.demo.commandVSstrategy.strategy;

/**
 * @author wangle
 * @date 2019/1/15/14:57
 **/
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new Zip());
        context.compress("windows","D盘");
        context.uncompress("D盘","windows");
    }
}
