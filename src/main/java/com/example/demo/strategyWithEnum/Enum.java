package com.example.demo.strategyWithEnum;

import java.util.Set;

/**
 * @author wangle
 * @date 2019/1/10/9:41
 **/
public class Enum {
    public enum Style {FIR,SEC,THI}
    public void applyStyles(Set<Style> styles){
        System.out.println(styles);
    }
}
