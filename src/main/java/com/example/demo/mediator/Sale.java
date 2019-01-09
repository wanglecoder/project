package com.example.demo.mediator;

/**
 * @author wangle
 * @date 2018/12/24/11:53
 * 销售
 **/
public class Sale {
    private AbstractMediator mediator;

    public void selfMethod(){}

    public void mediatorMethod(){
        this.mediator.doSomething("sale",50);
    }

    public AbstractMediator getMediator() {
        return mediator;
    }

    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
