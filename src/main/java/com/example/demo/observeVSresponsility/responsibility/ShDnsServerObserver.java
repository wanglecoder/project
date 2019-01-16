package com.example.demo.observeVSresponsility.responsibility;

/**
 * @author wangle
 * @date 2019/1/16/15:04
 **/
public class ShDnsServerObserver extends DnsServer {
    @Override
    protected boolean isLocal(Recored recored) {
        return recored.getDomain().endsWith(".sh.cn");
    }

    @Override
    protected void sign(Recored recored) {
        recored.setOwner("上海服务器");
    }
}
