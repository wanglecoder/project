package com.example.demo.abstractFactoryVSbuild.abstractFactory;

/**
 * @author wangle
 * @date 2019/1/14/14:00
 **/
public class BenziFactory extends AbstractFactory {
    @Override
    ICar createSUVCar() {
        return new BenziSUVCar();
    }

    @Override
    ICar createBusiCar() {
        return new BenziVanCar();
    }
}
