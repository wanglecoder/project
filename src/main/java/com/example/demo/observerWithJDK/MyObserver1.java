package com.example.demo.observerWithJDK;

import java.util.Observable;
import java.util.Observer;

/**
 * @author HEDY
 * @date 2018/11/26/10:46
 **/
public class MyObserver1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof MySubject){
            System.out.println("MyObserver1 :"+((MySubject) o).getNews());
        }
    }
}
