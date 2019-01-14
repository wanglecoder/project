package com.example.demo.abstractFactoryVSbuild.abstractFactory;

/**
 * @author wangle
 * @date 2019/1/14/13:55
 **/
public abstract class AbstractFactory {
    abstract ICar createSUVCar();

    abstract ICar createBusiCar();
}
