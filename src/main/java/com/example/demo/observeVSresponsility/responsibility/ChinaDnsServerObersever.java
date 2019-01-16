package com.example.demo.observeVSresponsility.responsibility;

/**
 * @author wangle
 * @date 2019/1/16/15:07
 **/
public class ChinaDnsServerObersever extends DnsServer {
    @Override
    protected boolean isLocal(Recored recored) {
        return recored.getDomain().endsWith(".cn");
    }

    @Override
    protected void sign(Recored recored) {
        recored.setOwner("国内顶尖服务器");
    }
}
