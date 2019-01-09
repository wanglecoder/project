package com.example.demo.mediator;

/**
 * @author wangle
 * @date 2018/12/24/11:53
 * 采购
 **/
public class Purchase {
    private AbstractMediator mediator;
    public void selfMethod(){

    }
    public void mediatorMethod(){
        this.mediator.doSomething("purchase",100);
    }

    public AbstractMediator getMediator() {
        return mediator;
    }

    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}

