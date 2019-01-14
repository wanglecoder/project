package com.example.demo.abstractFactoryVSbuild.build;

/**
 * @author wangle
 * @date 2019/1/14/15:08
 **/
public class Director {
    private static BenziSUVBuilder benziSUVBuilder = new BenziSUVBuilder();
    private static BWMSUVBuilder bwmsuvBuilder = new BWMSUVBuilder();
    private static BluePrint bluePrint = new BluePrint();

    public static Car getBenziSuvCar() {
        benziSUVBuilder.setEngine(getEngineByBluePrint());
        benziSUVBuilder.setwheel(getWheelByBluePrint());
        return benziSUVBuilder.getCar();
    }

    public static Car getBWMSuvCar() {
        benziSUVBuilder.setEngine(getEngineByBluePrint());
        benziSUVBuilder.setwheel(getWheelByBluePrint());
        return bwmsuvBuilder.getCar();
    }

    private static String getEngineByBluePrint() {
        return bluePrint.getEngine();
    }

    private static String getWheelByBluePrint() {
        return bluePrint.getWheel();
    }
}
