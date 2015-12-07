package com.alby.dp.iterator.example5;


import java.util.Iterator;

/**
 * Created by xianwei on 2015/12/7.
 * 用来实现访问数组的迭代接口
 */
public class ArrayIteratorImpl implements Iterator {
    /**
     * 用来存放被迭代的聚合对象
     */
    private SalaryManager aggregate = null;

    private int index = 0;

    public ArrayIteratorImpl(SalaryManager aggregate) {
        this.aggregate = aggregate;
    }


    @Override
    public boolean hasNext() {
        return aggregate != null && index < aggregate.size();
    }

    @Override
    public Object next() {
        Object object = null;
        if (hasNext()){
            object = aggregate.get(index);
            index++;
        }
        return object;
    }


    @Override
    public void remove() {

    }

}
