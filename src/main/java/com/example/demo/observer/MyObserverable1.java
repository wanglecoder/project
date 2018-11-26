package com.example.demo.observer;

/**
 * @author HEDY
 * @date 2018/11/26/10:26
 **/
public class MyObserverable1 implements MyObserverable {
    @Override
    public void change(String news) {
        System.out.println("MyObserverable1 : "+news);
    }
}
