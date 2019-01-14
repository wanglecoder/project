package com.example.demo.factoryVSbuild.build;

/**
 * @author wangle
 * @date 2019/1/14/10:45
 **/
public class ChildSuperManBuilder extends Builder {
    @Override
    SuperMan buildSuperMan() {
        super.setBody("childBody");
        super.setSpecialAbility("小孩超能力");
        super.setSymbol("small s");
        return superMan;
    }
}
