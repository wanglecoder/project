package com.example.demo.strategyProject;

/**
 * @author wangle
 * @date 2019/1/9/9:37
 **/
public interface IStrategy {
    Response getDropDownSelectValue(String type,String key);
    String getType();
}
