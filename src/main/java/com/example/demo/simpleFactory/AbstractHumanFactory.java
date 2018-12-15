package com.example.demo.simpleFactory;

/**
 * @author HEDY
 * @date 2018/11/28/13:53
 **/
public abstract class AbstractHumanFactory {
    public abstract <T extends IHuman> T getHuman(Class<T> c);
}
