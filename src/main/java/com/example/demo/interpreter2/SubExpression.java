package com.example.demo.interpreter2;

import java.util.Map;

/**
 * @author wangle
 * @date 2019/1/11/16:49
 **/
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> expression) {
        return left.interpreter(expression)-right.interpreter(expression);
    }
}
