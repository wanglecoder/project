package com.example.demo.decorate;

/**
 * @author HEDY
 * @date 2018/11/26/14:40
 **/
public class Latte extends ICoffee {

    @Override
    public String getDescribe() {
        describe="Latte";
        return describe;
    }

    @Override
    public double getCost() {
        return 18.0;
    }
}
