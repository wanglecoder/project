package com.example.demo.interpreter;

import java.util.Map;

/**
 * @author wangle
 * @date 2019/1/11/11:47
 **/
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> expression) {
        return super.left.interpreter(expression) - super.right.interpreter(expression);
    }
}
