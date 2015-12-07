package com.alby.dp.iterator.example8;


import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by xianwei on 2015/12/7.
 * 用来实现访问数组的迭代接口
 */
public class ArrayIteratorImpl implements Iterator {
    private PayModel[] pms = null;

    private int index = 0;

    public ArrayIteratorImpl(SalaryManager aggregate) {
        this.pms = aggregate.getPays();
    }


    @Override
    public boolean hasNext() {
        return pms != null && index <= pms.length - 1;
    }

    @Override
    public Collection next(int num) {
        Collection<PayModel> collection = new ArrayList<PayModel>();
        int count = 0;
        while (hasNext() && count<num){
            collection.add(pms[index]);
            index++;
            count++;
        }
        return collection;
    }

    @Override
    public boolean hasPrevious() {
        return pms != null && index > 0;
    }

    @Override
    public Collection previous(int num) {
        Collection<PayModel> collection = new ArrayList<PayModel>();
        while (hasPrevious() && num > 0){
            index--;
            collection.add(pms[index]);
            num -- ;
        }
        return collection;
    }
}
