package com.example.demo.observeVSresponsility.observer;

/**
 * @author wangle
 * @date 2019/1/16/13:52
 **/
public class GlobalDnsServer extends DnsServer {
    @Override
    protected Recored echo(String domain){
        Recored recored =  super.echo(domain);
        recored.setOwner("全球顶尖服务器");
        return recored;
    }

    @Override
    protected boolean isLocal(String domain) {
        return true;
    }
}
