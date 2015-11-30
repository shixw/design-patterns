package com.alby.dp.abstractfactory.example5;

public class RdbDetailDAOImpl implements OrderDetailDao {
    @Override
    public void saveOrderMain() {
        System.out.println("RdbDetailDAOImpl saveOrderMain");
    }
}
