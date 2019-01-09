package com.example.demo.responsibilityChain;

import java.util.List;

/**
 * @author wangle
 * @date 2019/1/8/11:16
 **/
public class Client {
    public static void main(String[] args) {
        Handler handler = new DictionaryHandler();
        handler.setNextHandler(new NurseLevelHandler());
        List<Response> responses = handler.handleMessage("dictionary", "key");
        System.out.println(responses);
    }
}
