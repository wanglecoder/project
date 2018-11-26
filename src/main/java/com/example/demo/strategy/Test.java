package com.example.demo.strategy;

/**
 * @author HEDY
 * @date 2018/11/26/9:43
 **/
public class Test {
    public static void main(String[] args) {
        YellowDuck yellowDuck = new YellowDuck();
        yellowDuck.call();
        yellowDuck.fly();
        yellowDuck.swim();
        yellowDuck.changCallable(new CallablezhiImpl());
        yellowDuck.call();
    }
}
