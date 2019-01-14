package com.example.demo.abstractFactoryVSbuild.build;

/**
 * @author wangle
 * @date 2019/1/14/15:08
 **/
public abstract class Builder {
    protected final Car car = new Car();

    protected void setBand(String band) {
        car.setBand(band);
    }

    protected void setModel(String model) {
        car.setModel(model);
    }

    protected void setEngine(String engine) {
        car.setEngine(engine);
    }

    protected void setwheel(String wheel) {
        car.setWheel(wheel);
    }

    protected abstract Car getCar();
}
