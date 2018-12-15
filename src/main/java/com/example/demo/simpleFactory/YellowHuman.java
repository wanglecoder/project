package com.example.demo.simpleFactory;

/**
 * @author HEDY
 * @date 2018/11/28/14:04
 **/
public class YellowHuman extends IHuman {
    @Override
    void getColor() {
        System.out.println("黄种人");
    }

    @Override
    void getVoice() {
        System.out.println("汉语");
    }
}
