package com.example.demo.observer;

/**
 * @author HEDY
 * @date 2018/11/26/10:15
 **/
public interface MySubject {
    void addSubscribe(MyObserverable observerable);
    void deleteSubscribe(MyObserverable observerable);
    void notifySubscribe();
}
