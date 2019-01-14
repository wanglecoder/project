package com.example.demo.factoryVSbuild.factory;

/**
 * @author wangle
 * @date 2019/1/14/10:28
 **/
public class Client {
    public static void main(String[] args) {
        Factory.getSuperMan("child").getSpecialAbility();
    }
}
