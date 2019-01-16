package com.example.demo.observeVSresponsility.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wangle
 * @date 2019/1/16/11:26
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        DnsServer sh  = new ShDnsServer();
        DnsServer ch = new ChinaDnsServer();
        DnsServer gl = new GlobalDnsServer();
        sh.setUpperDnsServer(ch);
        ch.setUpperDnsServer(gl);
        while(true){
            System.out.println("请输入域名,输入n退出");
            String domain = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if("n".equalsIgnoreCase(domain)){
                return;
            }
            Recored resolve = sh.resolve(domain);
            System.out.println(resolve);
        }
    }

}
