package com.example.demo.observeVSresponsility.responsibility;

/**
 * @author wangle
 * @date 2019/1/16/15:11
 **/
public class GlobalDnsServerObseever extends DnsServer {
    @Override
    protected boolean isLocal(Recored recored) {
        return true;
    }

    @Override
    protected void sign(Recored recored) {
        recored.setOwner("全球顶尖服务器");
    }
}
