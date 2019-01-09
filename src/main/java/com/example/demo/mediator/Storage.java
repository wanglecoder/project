package com.example.demo.mediator;

/**
 * @author wangle
 * @date 2018/12/24/11:53
 * 库存
 **/
public class Storage {
    private int storage;
    private AbstractMediator mediator;

    public void selfMethod(){}

    public void mediatorMethod(){
        this.mediator.doSomething("storage",null);
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public AbstractMediator getMediator() {
        return mediator;
    }

    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
