package com.example.demo.decorateWithCan;

/**
 * @author wangle
 * @date 2019/1/9/11:51
 **/
public class Client {
    public static void main(String[] args) {
        Decorate decorate = new Decorate(new ConcreteComponent());
        decorate.doSomthing();
    }
}
