package com.example.demo.state;

/**
 * @author wangle
 * @date 2019/1/11/10:35
 **/
public class Client {
    public static void main(String[] args) {
        Context context  = new Context();
        context.setLiftState(Context.openState);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
