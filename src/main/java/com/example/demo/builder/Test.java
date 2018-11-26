package com.example.demo.builder;

/**
 * @author HEDY
 * @date 2018/11/23/15:33
 **/
public class Test {
    public static void main(String[] args) {
        EffectiveCode effectiveCode = new EffectiveCode.Builder("locklock", "120", "coco").
                address("GZ").count("3").orderState("未发货").phoneNum("123").build();
        System.out.println(effectiveCode);
    }
}
