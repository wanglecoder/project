package com.example.demo.factoryVSbuild.build;

/**
 * @author wangle
 * @date 2019/1/14/10:39
 **/
public class Client {
    public static void main(String[] args) {
        System.out.println(Director.getAdultSuperMan());
        System.out.println(Director.getChildSuperMan());
    }
}
