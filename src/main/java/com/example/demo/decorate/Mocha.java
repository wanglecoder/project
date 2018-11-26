package com.example.demo.decorate;

/**
 * @author HEDY
 * @date 2018/11/26/14:44
 **/
public class Mocha extends ICoffee {
    public Mocha(){
        describe = "Mocha";
    }
    @Override
    public String getDescribe() {
        return describe;
    }

    @Override
    public double getCost() {
        return 20.0;
    }
}
