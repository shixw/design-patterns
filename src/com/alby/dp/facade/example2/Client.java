package com.alby.dp.facade.example2;

/**
 * Created by xianwei on 2015/11/27.
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //使用Facade，需要自己跟多个模块交互
//        AModuleApi a = new AModuleImpl();
//        a.testA();
//        BModuleApi b = new BModuleImpl();
//        b.testB();
//        CModuleApi c = new CModuleImpl();
//        c.testC();
        //使用Facade
        new Facade().test();
    }
}
