package com.example.demo.strategyWithEnum;

/**
 * @author wangle
 * @date 2019/1/9/13:54
 **/
public enum StrategyEnum {
    /**
     *加法
     */
    ADD("+"){
        @Override
        public int exec(int a , int b){
            return a + b;
        }
    },
    /**
     *减法
     */
    SUB("-"){
        @Override
        public int exec(int a ,int b){
            return a - b;
        }
    };
    String value = "";
    private StrategyEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public abstract int exec(int a , int b);

}
