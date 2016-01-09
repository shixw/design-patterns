package com.alby.dp.visitor.example3;

import java.util.ArrayList;
import java.util.Collection;

public class Client {

    public static void main(String[] args) {
        Collection<Customer> colCustomer = preparedTestData();

        for (Customer customer : colCustomer) {
            //进行偏好分析
            customer.predilectionAnalyze();

            customer.worthAnalyze();
        }
    }

    private static Collection<Customer> preparedTestData(){
        Collection<Customer> colCustomer = new ArrayList<Customer>();

        Customer cm1 = new EnterpriseCustomer();
        cm1.setName("ABC集团");
        colCustomer.add(cm1);

        Customer cm2 = new EnterpriseCustomer();
        cm2.setName("CDE集团");
        colCustomer.add(cm2);

        Customer cm3 = new PersonalCustomer();
        cm3.setName("张三");
        colCustomer.add(cm3);


        return colCustomer;
    }
}
