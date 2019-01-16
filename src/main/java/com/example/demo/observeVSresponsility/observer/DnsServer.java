package com.example.demo.observeVSresponsility.observer;

import java.util.Random;

/**
 * @author wangle
 * @date 2019/1/16/11:27
 **/
public abstract class DnsServer {
    private DnsServer upperDnsServer;

    public Recored resolve(String domain) {
        Recored recored;
        if (isLocal(domain)) {
            recored = echo(domain);
        } else {
            recored = this.upperDnsServer.resolve(domain);
        }
        return recored;
    }

    protected Recored echo(String domain) {
        Recored recored = new Recored();
        recored.setDomain(domain);
        recored.setIp(getIpAddress());
        return recored;
    }

    protected String getIpAddress() {
        Random random = new Random();
        return random.nextInt(225) + "." + random.nextInt(225) + "." + random.nextInt(225) + "." + random.nextInt(225) + ".";
    }


    public void setUpperDnsServer(DnsServer upperDnsServer) {
        this.upperDnsServer = upperDnsServer;
    }

    protected abstract boolean isLocal(String domain);


}
