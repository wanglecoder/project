package com.example.demo.decorateVSadapter.decorate;

/**
 * @author wangle
 * @date 2019/1/15/14:06
 **/
public class UglyDark implements Swan {
    @Override
    public void fly() {
        System.out.println("比较小,还不会飞");
    }

    @Override
    public void beatiful() {
        System.out.println("黑黢黢的");
    }
}
