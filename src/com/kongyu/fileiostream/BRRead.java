package com.kongyu.fileiostream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) {
        char c = 'a';
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下“q”停止");
        do{
            try {
                c = (char) br.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(c);
        }while (c!='q');
    }
}
