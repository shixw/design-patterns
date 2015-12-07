package com.alby.dp.iterator.example9;

import java.util.Collection;

public class Client {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();

        Iterator iterator = salaryManager.createIterator();

        Collection col = iterator.getPage(1,2);
        System.out.println("第一页数据----");
        System.out.println(col);

        Collection col2 = iterator.getPage(2,2);
        System.out.println("第二页数据----");
        System.out.println(col2);

        Collection col3 = iterator.getPage(3,2);
        System.out.println("第三页----");
        System.out.println(col3);
    }
}
