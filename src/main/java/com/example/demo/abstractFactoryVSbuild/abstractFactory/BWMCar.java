package com.example.demo.abstractFactoryVSbuild.abstractFactory;

/**
 * @author wangle
 * @date 2019/1/14/14:16
 **/
public abstract class BWMCar implements ICar {
    private final static String BAND = "BWM";
    @Override
    public String getBand() {
        return BAND;
    }

    @Override
    public abstract String getModel();
}
