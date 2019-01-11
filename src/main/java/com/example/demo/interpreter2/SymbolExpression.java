package com.example.demo.interpreter2;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wangle
 * @date 2019/1/11/16:33
 **/
@Getter
@Setter
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
