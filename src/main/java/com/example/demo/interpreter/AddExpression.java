package com.example.demo.interpreter;

import java.util.Map;

/**
 * @author wangle
 * @date 2019/1/11/11:45
 **/
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> expression) {
        return super.left.interpreter(expression) + super.right.interpreter(expression);
    }
}
