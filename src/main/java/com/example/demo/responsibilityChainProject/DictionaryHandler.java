package com.example.demo.responsibilityChainProject;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangle
 * @date 2019/1/8/13:47
 **/
public class DictionaryHandler implements Handler {
    @Override
    public List<Response> handleMethod(String type, String key) {
        if(ConstantType.DIC.equals(type)){
            return Arrays.asList(new Response("dic","dictionary"));
        }
        return new RealChain(new Client().getHandlers(),1).executeMethod(type,key);
    }
}
