package com.example.demo.simpleFactory;

/**
 * @author HEDY
 * @date 2018/11/28/14:06
 **/
public class Client {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();
        IHuman human = factory.getHuman(YellowHuman.class);
        human.getColor();
        human.getVoice();
    }
}
