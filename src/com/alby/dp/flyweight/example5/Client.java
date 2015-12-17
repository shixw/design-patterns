package com.alby.dp.flyweight.example5;


public class Client {
    public static void main(String[] args) {
        SecurityMgr mgr = SecurityMgr.getInstance();

        boolean f1 = mgr.hasPermit("张三","薪资数据","查看");
        boolean f2 = mgr.hasPermit("李四","薪资数据","查看");

        System.out.println(f1);
        System.out.println(f2);
    }
}
