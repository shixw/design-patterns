package com.alby.dp.iterator.example7;


/**
 * Created by xianwei on 2015/12/7.
 * 用来实现访问数组的迭代接口
 */
public class ArrayIteratorImpl implements Iterator {
    /**
     * 用来存放被迭代的聚合对象
     */
    private SalaryManager aggregate = null;

    private int index = -1;

    public ArrayIteratorImpl(SalaryManager aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        index = index + 1;
    }

    @Override
    public boolean isDone() {
        return index == this.aggregate.size();
    }

    @Override
    public Object currentItem() {
        return this.aggregate.get(index);
    }

    @Override
    public boolean isFirst() {
        return index == 0;
    }

    @Override
    public void previous() {
        if (index > 0) {
            index = index - 1;
        }
    }
}
