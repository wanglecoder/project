package com.example.demo.factoryVSbuild.build;

/**
 * @author wangle
 * @date 2019/1/14/10:39
 **/
public abstract class Builder {
    protected final SuperMan superMan = new SuperMan();

    public void setBody(String body){
        superMan.setBody(body);
    }

    public void setSpecialAbility(String specialAbility){
        superMan.setSpecialAbility(specialAbility);
    }

    public void setSymbol(String symbol){
        superMan.setSymbol(symbol);
    }

    abstract SuperMan buildSuperMan();

}
