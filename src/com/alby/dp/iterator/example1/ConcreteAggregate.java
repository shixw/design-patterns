package com.alby.dp.iterator.example1;

/**
 * Created by xianwei on 2015/12/7.
 * 具体的聚合对象，实现创建相应迭代器对象的功能
 */
public class ConcreteAggregate extends Aggregate {

    /**
     * 表示聚合对象具体的内容
     */
    private String[] ss = null;

    /**
     * 构造方法，传入聚合对象具体的内容
     */
    public ConcreteAggregate(String[] ss) {
        this.ss = ss;
    }

    @Override
    public Iterator createIterator() {
        //实现创建Iterator的工厂方法
        return new ConcreteIterator(this);
    }


    public int size() {
        return ss.length;
    }

    //获取索引对应的元素
    public Object get(int index) {
        Object retObj = null;
        if (index < ss.length) {
            retObj = ss[index];
        }
        return retObj;
    }
}
