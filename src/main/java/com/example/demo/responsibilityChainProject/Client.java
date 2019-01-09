package com.example.demo.responsibilityChainProject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangle
 * @date 2019/1/8/14:59
 **/
public class Client {
    List<Handler> handlers = new ArrayList<>();
    public List<Handler> getHandlers(){
        handlers.add(new DictionaryHandler());
        handlers.add(new NurseLevelHandler());
        return handlers;
    }
}
