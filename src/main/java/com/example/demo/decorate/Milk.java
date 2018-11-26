package com.example.demo.decorate;

/**
 * @author HEDY
 * @date 2018/11/26/14:46
 **/
public class Milk extends ICoffeeDecorate {
    ICoffee coffee;
    public Milk(ICoffee coffee){
        this.coffee=coffee;
    }
    @Override
    public String getDescribe() {
        return coffee.describe+",milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost()+3.0;
    }
}
