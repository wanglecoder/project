package com.example.demo.strategy;

/**
 * @author HEDY
 * @date 2018/11/26/9:15
 **/
public class Duck {
    ICallable callable;
    IFlyable flyable;
    public void swim(){
        System.out.println("I can swim");
    }
    public void fly(){
        flyable.fly();
    }
    public void call(){
        callable.call();
    }
}
