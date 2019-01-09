package com.example.demo.strategyProject;

/**
 * @author wangle
 * @date 2019/1/9/9:42
 **/
public class DictionaryStrategy implements IStrategy {
    @Override
    public Response getDropDownSelectValue(String type, String key) {
        return new Response("dic","dictionary");
    }

    @Override
    public String getType() {
        return ConstantType.DIC;
    }
}
