package com.example.demo.interpreter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangle
 * @date 2019/1/11/17:02
 **/
public class Client {
    public static void main(String[] args) throws IOException{
        String expStr = getExpStr();
        Map<String, Integer> expression = getExpression(expStr);

    }

    public static String getExpStr() throws IOException {
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static Map<String, Integer> getExpression(String expStr) throws IOException{
        Map<String, Integer> map = new HashMap<>(16);
        char[] chars = expStr.toCharArray();
        for (char ch : chars) {
            if (ch != '+' && ch != '-') {
                System.out.println("请输入"+ch+"的值:");
                String value = new BufferedReader(new InputStreamReader(System.in)).readLine();
                map.put(String.valueOf(ch),Integer.valueOf(value));
            }
        }
        return map;
    }
}
