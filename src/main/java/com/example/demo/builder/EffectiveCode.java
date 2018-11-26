package com.example.demo.builder;

/**
 * @author HEDY
 * @date 2018/11/23/15:17
 * 建造者模式demo(构造器参数大于4/静态工厂参数较多时,可以采用建造者模式)
 **/
public class EffectiveCode {
    private String name;
    private String orderTime;
    private String orderState;
    private String price;
    private String count;
    private String goodsName;
    private String address;
    private String phoneNum;
    public static class Builder implements IBuilder<EffectiveCode> {
        //必需的参数
        private String name;
        private String price;
        private String goodName;
        //可选参数
        private String orderTime;
        private String orderState;
        private String count;
        private String address;
        private String phoneNum;
        public Builder(String name,String price,String goodName){
            this.name=name;
            this.price = price;
            this.goodName = goodName;
        }
        public Builder orderTime(String orderTime){
            this.orderTime = orderTime;
            return this;
        }
        public Builder orderState(String orderState){
            this.orderState = orderState;
            return this;
        }
        public Builder count(String count){
            this.count = count;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Builder phoneNum(String phoneNum){
            this.phoneNum = phoneNum;
            return this;
        }
        @Override
        public EffectiveCode build(){
            return new EffectiveCode(this);
        }
    }
    private EffectiveCode(Builder builder){
        this.address = builder.address;
        this.count = builder.count;
        this.goodsName = builder.goodName;
        this.name = builder.name;
        this.orderState = builder.orderState;
        this.orderTime = builder.orderTime;
        this.price = builder.price;
        this.phoneNum = builder.phoneNum;
    }

    @Override
    public String toString() {
        return "EffectiveCode{" +
                "name='" + name + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", orderState='" + orderState + '\'' +
                ", price='" + price + '\'' +
                ", count='" + count + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
