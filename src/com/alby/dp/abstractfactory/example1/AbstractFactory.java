package com.alby.dp.abstractfactory.example1;

/**
 * Created by xianwei on 2015/11/30.
 * 抽象工厂接口，声明创建抽象产品对象的操作
 */
public interface AbstractFactory     {
    /**
     * 创建抽象产品A的对象
     * @return  抽象产品A的对象
     */
    public AbstractProductA createProductA();

    /**
     * 创建抽象产品B的对象
     * @return  抽象产品B的对象
     */
    public AbstractProductB createProductB();
}
