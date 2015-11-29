package com.alby.dp.singleton.example3;

/**
 * Created by xianwei on 2015/11/29.
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        APPConfig config = new APPConfig();

        String paramA = config.getParameterA();
        String paramB = config.getParameterB();
        System.out.println("paramA = [" + paramA + "] , paramB = [" + paramB + "]");
    }
}
