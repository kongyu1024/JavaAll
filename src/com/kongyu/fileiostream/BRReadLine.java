package com.kongyu.fileiostream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLine {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String br = "";
        System.out.println("输入一句话");
        System.out.println("以end结束");
        do{
            try {
                br = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(br);

        }while (!br.equals("end"));

    }
}
