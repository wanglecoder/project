package com.example.demo.abstractFactoryVSbuild.abstractFactory;

/**
 * @author wangle
 * @date 2019/1/14/14:04
 **/
public class Client {
    public static void main(String[] args) {
        BenziFactory benziFactory = new BenziFactory();
        System.out.println(benziFactory.createBusiCar().getBand());
        System.out.println(benziFactory.createBusiCar().getModel());
        System.out.println(benziFactory.createSUVCar().getBand());
        System.out.println(benziFactory.createSUVCar().getModel());
        BWMFactory bwmFactory = new BWMFactory();
        System.out.println(bwmFactory.createBusiCar().getBand());
        System.out.println(bwmFactory.createBusiCar().getModel());
        System.out.println(bwmFactory.createSUVCar().getBand());
        System.out.println(bwmFactory.createSUVCar().getModel());
    }
}
