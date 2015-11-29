package com.alby.dp.factorymethod.example6;

/**
 * Created by xianwei on 2015/11/29.
 *
 */
public class A {

    /**
     * 等待被注入进来
     */
    private C c = null;

    /**
     * 注入资源的c的方法
     * @param c 被注入的资源
     */
    public void setC(C c){
        this.c = c;
    }

    public void t1(){
        //自己不用管怎么获取c直接使用就好
        c.tc();
    }
}
