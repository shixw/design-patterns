package com.alby.dp.factorymethod.example1;

/**
 * Created by xianwei on 2015/11/29.
 * 创建器，声明工厂方法
 */
public abstract class Creator {
    /**
     * 创建Product的工厂方法
     * @return  Product对象
     */
    protected abstract Product factoryMethod();

    /**
     * 实现某些功能的方法
     */
    public void someOperation(){
        Product product = factoryMethod();
    }
}
