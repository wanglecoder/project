package com.example.demo.strategyWithEnum;

/**
 * @author wangle
 * @date 2019/1/9/14:24
 **/
public enum  StrategySelectEnum {
    /**
     *
     */
    DIC("dictionary"){
        @Override
        public Response getSelectValue(String key){
            return new Response("dictionary","dic");
        }
    },
    /**
     *
     */
    NURSE("nurse"){
        @Override
        public Response getSelectValue(String key){
            return new Response("nurse","nurse");
        }
    };
    private String value;
    StrategySelectEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public abstract Response getSelectValue(String key);
}
