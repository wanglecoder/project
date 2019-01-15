package com.example.demo.decorateVSadapter.adapter;

/**
 * @author wangle
 * @date 2019/1/15/14:36
 **/
public class UglyDarkAdpter implements Dark,Swan {
    @Override
    public void guagua() {
        System.out.println("呱呱");
    }

    @Override
    public void fly() {
        System.out.println("fly,fly");
    }

    @Override
    public void beautify() {
        System.out.println("beautiful");
    }
}
