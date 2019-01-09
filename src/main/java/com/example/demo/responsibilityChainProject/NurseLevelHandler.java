package com.example.demo.responsibilityChainProject;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangle
 * @date 2019/1/8/14:57
 **/
public class NurseLevelHandler implements Handler {
    @Override
    public List<Response> handleMethod(String type, String key) {
        if(ConstantType.NURSE.equals(type)){
            return Arrays.asList(new Response("dic","dictionary"));
        }
        return new RealChain().executeMethod(type,key);
    }
}
