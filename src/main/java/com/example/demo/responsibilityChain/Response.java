package com.example.demo.responsibilityChain;

/**
 * @author wangle
 * @date 2019/1/8/11:08
 **/
public class Response {
    private String key;
    private String name;

    public Response(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Response{" +
                "key='" + key + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
