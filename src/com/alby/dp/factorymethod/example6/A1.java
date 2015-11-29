package com.alby.dp.factorymethod.example6;

/**
 * Created by xianwei on 2015/11/29.
 *
 */
public abstract class A1 {

    /**
     * 工厂方法，创建C1，类似于依赖注入进来的途径
     */
    protected abstract C1 createC1();

    public void t1(){
        createC1().tc();
    }
}
