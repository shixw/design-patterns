package com.alby.dp.iterator.example1;

/**
 * Created by xianwei on 2015/12/7.
 * 聚合对象的接口，定义创建相应迭代器对象的接口
 */
public abstract class Aggregate {

    /**
     * 工厂方法，创建相应大迭代器对象的接口
     */
    public abstract Iterator createIterator();


}
