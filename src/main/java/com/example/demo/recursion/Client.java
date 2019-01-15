package com.example.demo.recursion;

import java.util.List;

/**
 * @author wangle
 * @date 2019/1/15/9:11
 **/
public class Client {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        List<List<Integer>> targetList = recursion.getTargetList(new int[]{ 2, 3, 4, 2, 6, 7}, 7);
        System.out.println(targetList);
    }
}
