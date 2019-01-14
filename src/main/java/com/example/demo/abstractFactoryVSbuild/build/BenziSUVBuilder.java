package com.example.demo.abstractFactoryVSbuild.build;

/**
 * @author wangle
 * @date 2019/1/14/15:09
 **/
public class BenziSUVBuilder extends Builder{
    @Override
    protected Car getCar() {
        car.setBand("benzi");
        car.setModel("suv");
        car.setWheel("benzi");
        car.setEngine("benzi");
        return car;
    }
}
