package com.example.demo.observeVSresponsility.responsibility;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * @author wangle
 * @date 2019/1/16/14:18
 **/
public abstract class DnsServer extends Observable implements Observer {

    protected abstract boolean isLocal(Recored recored);

    public void setUpperServer(DnsServer dnsServer){
//        super.deleteObservers();
        super.addObserver(dnsServer);
    }
    //被观察者
    public void notice(Recored recored){
        super.setChanged();
        super.notifyObservers(recored);
    }

    @Override
    //观察者
    public void update(Observable o, Object arg) {
        Recored recored = (Recored) arg;
        if(isLocal(recored)){
            recored.setIp(getIpAddress());
        }else{
            notice(recored);
        }
        //签名
        sign(recored);
    }

    private String getIpAddress() {
        Random random = new Random();
        return random.nextInt(225)+"."+random.nextInt(225)+"."+random.nextInt(225)+"."+random.nextInt(225)+".";
    }

    protected abstract void sign(Recored recored);
}
