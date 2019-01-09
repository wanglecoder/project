package com.example.demo.responsibilityChain;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangle
 * @date 2019/1/8/11:13
 **/
public class NurseLevelHandler extends Handler {
    private static final String TYPE = "nurse_level";
    @Override
    protected List<Response> handle(String type, String key) {
        if(TYPE.equals(type)){
            return Arrays.asList(new Response("nurse_level","key"));
        }
        return null;
    }
}
