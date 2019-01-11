package com.example.demo.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangle
 * @date 2019/1/11/13:48
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        Map<String, Integer> value = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果为:" + expStr + "=" + calculator.run(value));
    }

    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式:");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static Map<String, Integer> getValue(String expStr) throws IOException {
        Map<String, Integer> map = new HashMap<>(16);
        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.println("请输入" + ch + "的值:");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}
