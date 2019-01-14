package com.example.demo.abstractFactoryVSbuild.build;

/**
 * @author wangle
 * @date 2019/1/14/15:09
 **/
public class BWMSUVBuilder extends Builder {
    @Override
    protected Car getCar() {
        car.setBand("bwm");
        car.setModel("suv");
        car.setEngine("bwm");
        car.setWheel("bwm");
        return car;
    }
}
