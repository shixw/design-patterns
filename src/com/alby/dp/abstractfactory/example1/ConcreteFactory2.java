package com.alby.dp.abstractfactory.example1;

/**
 * Created by xianwei on 2015/11/30.
 * 具体的工厂实现对象，实现创建具体的产品对象的操作
 */
public class ConcreteFactory2 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
