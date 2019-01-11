package com.example.demo.interpreter2;

import java.util.Map;

/**
 * @author wangle
 * @date 2019/1/11/16:12
 **/
public abstract class Expression {
    public abstract int interpreter(Map<String,Integer> expression);
}
