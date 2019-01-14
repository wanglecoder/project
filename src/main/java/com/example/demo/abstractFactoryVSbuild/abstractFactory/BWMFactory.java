package com.example.demo.abstractFactoryVSbuild.abstractFactory;

/**
 * @author wangle
 * @date 2019/1/14/14:00
 **/
public class BWMFactory extends AbstractFactory {
    @Override
    ICar createSUVCar() {
        return new BWMSUVCar();
    }

    @Override
    ICar createBusiCar() {
        return new BWMVanCar();
    }
}
