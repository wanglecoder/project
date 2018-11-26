package com.example.demo.observerWithJDK;

/**
 * @author HEDY
 * @date 2018/11/26/10:51
 **/
public class Test {
    public static void main(String[] args) {
        MySubject mySubject = new MySubject();
        mySubject.addObserver(new MyObserver1());
        mySubject.addObserver(new MyObserver2());
        mySubject.setNews("this is boom news");
        mySubject.notifyObservers();
    }
}
