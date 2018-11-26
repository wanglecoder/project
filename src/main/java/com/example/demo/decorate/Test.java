package com.example.demo.decorate;

/**
 * @author HEDY
 * @date 2018/11/26/14:53
 **/
public class Test {
    public static void main(String[] args) {
        ICoffee coffee = new Mocha();
        System.out.println(coffee.getDescribe()+" $ "+coffee.getCost());
        ICoffee coffee1 = new Mocha();
        coffee1 = new Milk(coffee1);
        coffee1 = new Sugar(coffee1);
        System.out.println(coffee1.getDescribe()+" $ "+coffee1.getCost());
    }
}
