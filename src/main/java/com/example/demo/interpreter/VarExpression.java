package com.example.demo.interpreter;

import java.util.Map;

/**
 * @author wangle
 * @date 2019/1/11/11:37
 **/
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> expression) {
        return expression.get(key);
    }
}
