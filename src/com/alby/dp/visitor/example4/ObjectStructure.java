package com.alby.dp.visitor.example4;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by xianwei on 2016/1/9.
 *
 */
public class ObjectStructure {

    private Collection<Customer> col = new ArrayList<Customer>();


    public void handleRequest(Visitor visitor){
        for (Customer customer : col) {
            customer.accept(visitor);
        }
    }

    public void addElement(Customer ele){
        col.add(ele);
    }
}
