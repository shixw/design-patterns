package com.alby.dp.abstractfactory.example6.dao.impl;

public class RdbDetailDAOImpl implements OrderDetailDao {
    @Override
    public void saveOrderMain() {
        System.out.println("RdbDetailDAOImpl saveOrderMain");
    }
}
