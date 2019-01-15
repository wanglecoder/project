package com.example.demo.decorateVSadapter.adapter;

/**
 * @author wangle
 * @date 2019/1/15/14:20
 **/
public class Client {
    public static void main(String[] args) {
        Dark dark = new UglyDarkAdpter();
        ((UglyDarkAdpter) dark).beautify();
        ((UglyDarkAdpter) dark).fly();
        dark.guagua();
    }
}
