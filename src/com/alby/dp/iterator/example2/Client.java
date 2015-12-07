package com.alby.dp.iterator.example2;

import java.util.Collection;
import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        //访问集团的工资列表
        PayManager payManager = new PayManager();

        payManager.calcPay();

        Collection paylist = payManager.getPayList();
        Iterator iterator = paylist.iterator();
        System.out.println("集团工资列表：=====");
        while (iterator.hasNext()) {
            PayModel pm = (PayModel) iterator.next();
            System.out.println(pm);
        }

        //访问新收购公司的工资列表
        SalaryManager salaryManager = new SalaryManager();

        salaryManager.calcSalary();

        PayModel[] pms = salaryManager.getPays();
        System.out.println("新收购的公司的工资列表：=======");
        for (PayModel pm : pms) {
            System.out.println(pm);
        }
    }
}
