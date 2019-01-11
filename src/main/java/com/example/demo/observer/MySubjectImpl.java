package com.example.demo.observer;

import java.util.ArrayList;

/**
 * @author HEDY
 * @date 2018/11/26/10:18
 **/
public class MySubjectImpl implements MySubject {
    private ArrayList<MyObserverable> subsribes;
    private String news;
    public MySubjectImpl(){
        subsribes = new ArrayList<>();
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void addSubscribe(MyObserverable observerable) {
        if(observerable!=null&&!subsribes.contains(observerable)) {
            subsribes.add(observerable);
        }
    }


    @Override
    public void deleteSubscribe(MyObserverable observerable) {
        subsribes.remove(observerable);
    }

    @Override
    public void notifySubscribe() {
        for (MyObserverable subsribe : subsribes) {
            subsribe.change(news);
        }
    }
}
