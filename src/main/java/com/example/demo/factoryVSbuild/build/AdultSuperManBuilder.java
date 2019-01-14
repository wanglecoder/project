package com.example.demo.factoryVSbuild.build;

/**
 * @author wangle
 * @date 2019/1/14/10:44
 **/
public class AdultSuperManBuilder extends Builder {
    @Override
    SuperMan buildSuperMan() {
        super.setBody("超人body");
        super.setSpecialAbility("adultAbility");
        super.setSymbol("bigS");
        return superMan;
    }
}
