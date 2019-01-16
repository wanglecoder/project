package com.example.demo.observeVSresponsility.observer;

/**
 * @author wangle
 * @date 2019/1/16/13:50
 **/
public class ChinaDnsServer extends DnsServer {
    @Override
    protected Recored echo(String domain) {
        Recored recored = super.echo(domain);
        recored.setOwner("中国顶尖服务器");
        return recored;
    }

    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".cn");
    }
}
