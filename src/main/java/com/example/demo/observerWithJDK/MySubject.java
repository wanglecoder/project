package com.example.demo.observerWithJDK;

import java.util.Observable;

/**
 * @author HEDY
 * @date 2018/11/26/10:37
 **/
public class MySubject extends Observable {
    private String news;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
        this.setChanged();
    }
}
