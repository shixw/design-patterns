package com.alby.dp.iterator.example1;

/**
 * Created by xianwei on 2015/12/7.
 * 迭代器接口，定义访问和遍历元素的操作
 */
public interface Iterator {
    /**
     * 移动到聚合对象的第一个位置
     */
    void first();

    /**
     * 移动到聚合对象的下一个位置
     */
    void next();

    /**
     * 判断是否已经移动聚合对象的最后一个位置
     */
    boolean isDone();

    /**
     *  获取迭代的当前元素
     */
    Object currentItem();

}
