package com.example.demo.strategyProject;

import java.util.List;

/**
 * @author wangle
 * @date 2019/1/9/9:45
 **/
public class SelectValue {
    private IStrategy strategy;
    private List<IStrategy> strategies;
    public SelectValue(){
        this.strategies = StrategyList.strategies;
    }
    Response getSelectValue(String type,String key){
        if(strategies.size()>0){
            for (IStrategy strategy : strategies) {
                if(strategy.getType().equals(type)){
                    this.strategy = strategy;
                    break;
                }
            }
        }
        if(strategy==null){
            return null;
        }
        return strategy.getDropDownSelectValue(type,key);
    }
}
