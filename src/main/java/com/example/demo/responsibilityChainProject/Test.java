package com.example.demo.responsibilityChainProject;

/**
 * @author wangle
 * @date 2019/1/8/15:02
 **/
public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        RealChain realChain = new RealChain(client.getHandlers(),0);
        System.out.println(realChain.executeMethod("nurse_level","key"));
    }
}
