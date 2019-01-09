package com.example.demo.strategyProject;

/**
 * @author wangle
 * @date 2019/1/9/9:42
 **/
public class NurseLevelStrategy implements IStrategy {
    @Override
    public Response getDropDownSelectValue(String type, String key) {
        return new Response("nurse","nurse_level");
    }

    @Override
    public String getType() {
        return ConstantType.NURSE;
    }
}
