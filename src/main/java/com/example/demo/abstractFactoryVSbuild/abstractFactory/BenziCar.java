package com.example.demo.abstractFactoryVSbuild.abstractFactory;

/**
 * @author wangle
 * @date 2019/1/14/14:22
 **/
public abstract class BenziCar implements ICar {
    @Override
    public String getBand() {
        return "BENZI";
    }

    @Override
    public abstract String getModel();
}
