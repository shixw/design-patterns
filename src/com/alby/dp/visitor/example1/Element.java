package com.alby.dp.visitor.example1;

/**
 * Created by xianwei on 2016/1/9.
 * 被访问的元素的接口
 */
public abstract class Element {

    /**
     * 接口访问者的访问
     * @param visitor 访问者对象
     */
    abstract void accept(Visitor visitor);
}
