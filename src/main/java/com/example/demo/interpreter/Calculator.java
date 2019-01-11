package com.example.demo.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * @author wangle
 * @date 2019/1/11/11:48
 **/
public class Calculator {
    private Expression expression;

    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack<>();
        char[] chars = expStr.toCharArray();
        Expression left;
        Expression right;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int run(Map<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}

