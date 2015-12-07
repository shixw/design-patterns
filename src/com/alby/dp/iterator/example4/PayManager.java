package com.alby.dp.iterator.example4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianwei on 2015/12/7.
 * 客户方已有的工资管理对象
 */
public class PayManager {

    private List<PayModel> list = new ArrayList<PayModel>();

    public List<PayModel> getPayList(){
        return list;
    }

    public void calcPay(){
        PayModel pm1 = new PayModel();
        pm1.setPay(3800);
        pm1.setUserName("战三");

        PayModel pm2 = new PayModel();
        pm2.setPay(5800);
        pm2.setUserName("李四");

        list.add(pm1);
        list.add(pm2);
    }
}
