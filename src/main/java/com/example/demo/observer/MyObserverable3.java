package com.example.demo.observer;

/**
 * @author HEDY
 * @date 2018/11/26/10:27
 **/
public class MyObserverable3 implements MyObserverable {
    @Override
    public void change(String news) {
        System.out.println("MyObserverable3 : "+news);
    }
}
