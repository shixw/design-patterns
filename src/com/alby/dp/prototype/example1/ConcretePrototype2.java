package com.alby.dp.prototype.example1;

/**
 * Created by xianwei on 2015/12/2.
 * 克隆具体实现对象
 */
public class ConcretePrototype2 implements Prototype {
    @Override
    public Prototype clone() {

        //最简单的克隆，新建一个自身对象，由于没有属性，so 不复制值
        return new ConcretePrototype2();
    }
}
