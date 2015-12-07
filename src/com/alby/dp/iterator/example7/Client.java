package com.alby.dp.iterator.example7;

public class Client {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();

        Iterator iterator = salaryManager.createIterator();

        iterator.first();

        while (!iterator.isDone()){
            PayModel pm = (PayModel) iterator.currentItem();
            System.out.println("next=="+pm);
            iterator.next();
        }

        while (!iterator.isFirst()){
            iterator.previous();
            PayModel pm = (PayModel) iterator.currentItem();
            System.out.println("next=="+pm);
        }
    }
}
