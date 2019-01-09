package com.example.demo.strategyProject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangle
 * @date 2019/1/9/10:08
 **/
public class StrategyList {
    public static List<IStrategy> strategies = new ArrayList<>();
    static {
        strategies.add(new DictionaryStrategy());
        strategies.add(new NurseLevelStrategy());
    }
}
