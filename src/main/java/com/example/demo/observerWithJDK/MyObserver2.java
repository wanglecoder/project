package com.example.demo.observerWithJDK;

import java.util.Observable;
import java.util.Observer;

/**
 * @author HEDY
 * @date 2018/11/26/10:50
 **/
public class MyObserver2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof MySubject){
            System.out.println("MyObserver2 :"+((MySubject) o).getNews());
        }
    }
}
