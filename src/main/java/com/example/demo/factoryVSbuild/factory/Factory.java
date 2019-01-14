package com.example.demo.factoryVSbuild.factory;

/**
 * @author wangle
 * @date 2019/1/14/10:28
 **/
public class Factory {
    private static final String ADULT = "adult";
    private static final String CHILD = "child";

    public static SuperMan getSuperMan(String type) {
        SuperMan superMan = null;
        if (ADULT.equalsIgnoreCase(type)) {
            superMan = new AdultSuperMan();
        } else if (CHILD.equalsIgnoreCase(type)) {
            superMan = new ChildSuperMan();
        }
        return superMan;
    }
}
