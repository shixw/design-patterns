package com.alby.dp.iterator.example6;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by xianwei on 2015/12/7.
 * 用来实现访问数组的迭代接口
 */
public class ArrayIteratorImpl implements Iterator {

    private PayModel[] pms = null;

    private int index = 0;

    public ArrayIteratorImpl(SalaryManager aggregate) {
        Collection<PayModel> tempCol = new ArrayList<PayModel>();
        for (PayModel pm : aggregate.getPays()){
            if (pm.getPay() < 3000){
                tempCol.add(pm);
            }
        }

        this.pms = new PayModel[tempCol.size()];
        int i = 0;
        for (PayModel payModel : tempCol) {
            this.pms[i] = payModel;
            i++;
        }
    }


    @Override
    public boolean hasNext() {
        return pms != null && index < pms.length;
    }

    @Override
    public Object next() {
        Object object = null;
        if (hasNext()){
            object = pms[index];
            index++;
        }

        //在这里对要返回的数据进行过滤，比如不让查看工资数据

        if (object != null) {
            ((PayModel)object).setPay(0.0);
        }
        return object;
    }


    @Override
    public void remove() {

    }

}
