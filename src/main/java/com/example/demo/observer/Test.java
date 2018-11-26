package com.example.demo.observer;

/**
 * @author HEDY
 * @date 2018/11/26/10:28
 **/
public class Test {
    public static void main(String[] args) {
        MySubjectImpl mySubject = new MySubjectImpl();
        mySubject.addSubscribe(new MyObserverable1());
        mySubject.addSubscribe(new MyObserverable2());
        mySubject.addSubscribe(new MyObserverable3());
        mySubject.setNews("this is boom news");
        mySubject.notifySubscribe();
    }
}
