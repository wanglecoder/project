package com.example.demo.factoryVSbuild.build;

/**
 * @author wangle
 * @date 2019/1/14/10:39
 **/
public class Director {
    private static ChildSuperManBuilder childSuperManBuilder = new ChildSuperManBuilder();
    private static AdultSuperManBuilder adultSuperManBuilder = new AdultSuperManBuilder();

    public static SuperMan getChildSuperMan() {
        return childSuperManBuilder.buildSuperMan();
    }

    public static SuperMan getAdultSuperMan() {
        return adultSuperManBuilder.buildSuperMan();
    }
}
