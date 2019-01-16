package com.example.demo.observeVSresponsility.responsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wangle
 * @date 2019/1/16/14:15
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        DnsServer sh = new ShDnsServerObserver();
        DnsServer ch = new ChinaDnsServerObersever();
        DnsServer gl = new GlobalDnsServerObseever();
        sh.setUpperServer(ch);
        ch.setUpperServer(gl);
        while(true){
            System.out.println("请输入域名,输入N退出");
            String domain = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if("n".equalsIgnoreCase(domain)){
                return;
            }
            Recored recored = new Recored();
            recored.setDomain(domain);
            sh.update(ch,recored);
            System.out.println(recored);
        }
    }
}
