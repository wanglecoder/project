package com.example.demo.interpreter;

/**
 * @author wangle
 * @date 2019/1/11/11:43
 **/
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
