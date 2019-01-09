package com.example.demo.proxy;

/**
 * @author wangle
 * @date 2018/12/24/9:57
 **/
public class MySubject implements Subject {
    @Override
    public void doSomething(String something) {
        System.out.println("执行这些东西"+something);
    }
}
