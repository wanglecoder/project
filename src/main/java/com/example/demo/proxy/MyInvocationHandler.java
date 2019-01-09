package com.example.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wangle
 * @date 2018/12/24/9:58
 **/
public class MyInvocationHandler implements InvocationHandler {
    private Object proxy;

    public MyInvocationHandler(Object proxy) {
        this.proxy = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.advice();
        Object invoke = method.invoke(this.proxy, args);
        this.tailAdvice();
        return invoke;
    }

    public void advice(){
        System.out.println("我来做增强了");
    }
    public void tailAdvice(){
        System.out.println("尾部增强");
    }
}
