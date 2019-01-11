package com.example.demo.interpreter2;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @author wangle
 * @date 2019/1/11/16:40
 **/
@Getter
@Setter
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> expression) {
        //递归计算
        return left.interpreter(expression) + right.interpreter(expression);
    }
}
