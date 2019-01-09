package com.example.demo.responsibilityChain;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangle
 * @date 2019/1/8/11:04
 **/
public class DictionaryHandler extends Handler {
    private static final String TYPE = "dictionary";
    @Override
    protected List<Response> handle(String type, String key) {
        if(TYPE.equals(type)){
            return Arrays.asList(new Response("dictionary","key"));
        }
        return null;
    }
}
