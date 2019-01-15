package com.example.demo.decorateVSadapter.decorate;

/**
 * @author wangle
 * @date 2019/1/15/14:04
 **/
public class Client {
    public static void main(String[] args) {
        Swan swan = new UglyDark();
        swan.fly();
        swan.beatiful();
        Decorate decorate = new FlyDecorate(swan);
        decorate.fly();
        decorate.beatiful();
        decorate = new BeautifyDecorate(new FlyDecorate(swan));
        decorate.beatiful();
        decorate.fly();
    }
}
