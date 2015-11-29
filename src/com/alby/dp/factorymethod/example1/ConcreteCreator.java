package com.alby.dp.factorymethod.example1;

/**
 * Created by xianwei on 2015/11/29.
 * 具体的创建器实现对象
 */
public class ConcreteCreator extends Creator {
    @Override
    protected Product factoryMethod() {
        //重定义工厂方法，返回一个具体的Product对象
        return new ConcreteProduct();
    }
}
