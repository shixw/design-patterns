package com.alby.dp.iterator.example9;


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
    public Collection getPage(int pagenum, int pageshow) {
        Collection<PayModel> collection = new ArrayList<PayModel>();

        int start = (pagenum-1)*pageshow;
        int end = start + pageshow-1;

        if (start<0){
            start = 0;
        }
        if (end > this.pms.length-1){
            end = this.pms.length-1;
        }
        index = start;
        while (hasNext() && index<=end){
            if (index>=start){
                collection.add(pms[index]);
            }
            index++;
        }
        return collection;
    }


    @Override
    public boolean hasPrevious() {
        return pms != null && index > 0;
    }


}
