package com.example.demo.strategy;



/**
 * @author HEDY
 * @date 2018/11/26/9:37
 **/
public class YellowDuck extends Duck {
    public YellowDuck(){
        callable = new CallableImpl();
        flyable = new FlyableImpl();
    }
    public void changCallable(ICallable newCallable){
        callable = newCallable;
    }
}
