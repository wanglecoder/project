package com.example.demo.simpleFactory;

/**
 * @author HEDY
 * @date 2018/11/28/14:05
 **/
public class WhiteHuman extends IHuman {
    @Override
    void getColor() {
        System.out.println("white color");
    }

    @Override
    void getVoice() {
        System.out.println("english");
    }
}
