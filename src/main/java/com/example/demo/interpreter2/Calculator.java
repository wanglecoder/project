package com.example.demo.interpreter2;

import java.util.Map;
import java.util.Stack;

/**
 * @author wangle
 * @date 2019/1/11/16:53
 * 计算类
 **/

public class Calculator {
    private Map<String, Integer> expression;

    public Calculator(String expStr) {
        Stack<Expression> stack  = new Stack<>();
        char[] chars = expStr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]){
                case('+'):
                    break;
                case('-'):
                    break;
                    default:
            }
        }
    }


}
