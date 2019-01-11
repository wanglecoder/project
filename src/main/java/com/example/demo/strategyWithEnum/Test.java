package com.example.demo.strategyWithEnum;

import java.util.EnumSet;

/**
 * @author wangle
 * @date 2019/1/9/14:10
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(StrategyEnum.SUB.exec(1,2));
        Constant test = new Constant(){
            @Override
            public int exec(int a,int b){
                return a-b;
            }
        };
        System.out.println(test.exec(4,4));
        System.out.println(StrategySelectEnum.DIC.getSelectValue("key"));
        System.out.println(StrategySelectEnum.valueOf("DIC"));

        Enum text = new Enum();
        text.applyStyles(EnumSet.of(Enum.Style.FIR, Enum.Style.SEC));
    }
}
