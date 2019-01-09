package com.example.demo.mediator;

/**
 * @author wangle
 * @date 2018/12/24/11:56
 **/
public class Mediator extends AbstractMediator {
    public Mediator(Purchase purchase, Sale sale, Storage storage) {
        super(purchase, sale, storage);
    }

    @Override
    protected void doSomething(String type,Object object) {
        switch (type){
            case "purchase": this.purchase();
            break;
            case "sale":this.sale();
            break;
            case "storage" : this.storage();
            break;
            default:this.doNoting();
        }
    }

    private void storage() {
        System.out.println("这是库存");
    }

    private void sale() {
        System.out.println("这是销售");
    }

    private void doNoting() {
        System.out.println("什么都不做");
    }

    private void purchase() {
        System.out.println("这是采购");
    }
}
