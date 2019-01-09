package com.example.demo.strategyProject;

/**
 * @author wangle
 * @date 2019/1/9/10:00
 **/
public class Test {
    public static void main(String[] args) {
        SelectValue selectValue1 = new SelectValue();
        System.out.println(selectValue1.getSelectValue("dictionary","key"));
        SelectValue selectValue2 = new SelectValue();
        System.out.println(selectValue2.getSelectValue("nurse_level","level"));
    }
}
