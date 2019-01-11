package com.example.demo.interpreter;

import java.util.Map;

/**
 * @author wangle
 * @date 2019/1/11/11:32
 **/
public abstract class Expression {
    public abstract int interpreter(Map<String, Integer> expression);
}
