package com.alby.dp.iterator.example5;


import java.util.Iterator;

public class Client {
    private static void test(Iterator iterator){

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        //访问集团的工资列表
        PayManager payManager = new PayManager();

        payManager.calcPay();

        System.out.println("集团工资列表：=====");
        test(payManager.createIterator());

        //访问新收购公司的工资列表
        SalaryManager salaryManager = new SalaryManager();

        salaryManager.calcSalary();

        System.out.println("新收购的公司的工资列表：=======");
        test(salaryManager.createIterator());
    }
}
