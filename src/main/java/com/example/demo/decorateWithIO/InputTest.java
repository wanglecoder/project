package com.example.demo.decorateWithIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author HEDY
 * @date 2018/11/26/16:23
 **/
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("c:test.txt")));
            while((c=in.read())>0){
                System.out.println((char)c);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
