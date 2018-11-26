package com.example.demo.strategy;

/**
 * @author HEDY
 * @date 2018/11/26/9:27
 **/
public class FlyableImpl implements IFlyable {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
