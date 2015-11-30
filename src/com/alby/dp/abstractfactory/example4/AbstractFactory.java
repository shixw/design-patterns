package com.alby.dp.abstractfactory.example4;

/**
 * Created by xianwei on 2015/11/30.
 * 可扩展抽象工厂
 */
public interface AbstractFactory {
    /**
     * 一个通用的创建产品对象的方法，为了简单直接返回Object
     * 也可以为所有被创建的产品定义一个公共的接口
     * @param type  具体创建的产品类型的标识
     * @return  创建出的产品对象
     */
    public Object createProduct(int type);
}
