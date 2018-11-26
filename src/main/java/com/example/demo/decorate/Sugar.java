package com.example.demo.decorate;

/**
 * @author HEDY
 * @date 2018/11/26/14:50
 **/
public class Sugar extends ICoffeeDecorate {
    ICoffee coffee;
    public Sugar(ICoffee coffee){
        this.coffee = coffee;
//        describe = coffee.getDescribe();
    }
    @Override
    public String getDescribe() {
        return coffee.getDescribe()+",sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost()+2.0;
    }
}
