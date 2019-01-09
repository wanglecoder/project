package com.example.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author wangle
 * @date 2018/12/24/10:06
 **/
public class Client {
    public static void main(String[] args) {
        Subject subject  = new MySubject();
        InvocationHandler h = new MyInvocationHandler(subject);
        Subject proxyInstance = (Subject)Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), h);
        proxyInstance.doSomething("123");
    }
}
