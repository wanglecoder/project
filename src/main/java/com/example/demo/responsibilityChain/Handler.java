package com.example.demo.responsibilityChain;

import java.util.List;

/**
 * @author wangle
 * @date 2019/1/8/10:48
 **/
public abstract class Handler {
    private Handler nextHandler;

    public final List<Response> handleMessage(String type, String key) {
        List<Response> results = this.handle(type, key);
        if (results != null) {
            return results;
        } else if (nextHandler != null) {
            return nextHandler.handle(type, key);
        } else {
            return null;
        }
    }

    protected abstract List<Response> handle(String type, String key);

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
