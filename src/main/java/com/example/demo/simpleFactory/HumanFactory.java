package com.example.demo.simpleFactory;

/**
 * @author HEDY
 * @date 2018/11/28/14:00
 **/
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends IHuman> T getHuman(Class<T> c) {
        IHuman human = null;
        try {
            human = (IHuman) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("创造人种失败: "+e.getMessage());
        }
        return (T) human;
    }
}
