package com.example.demo.strategy;

/**
 * @author HEDY
 * @date 2018/11/26/9:32
 **/
public class FlydisableImpl implements IFlyable {
    @Override
    public void fly() {
        System.out.println("I can`t fly");
    }
}
