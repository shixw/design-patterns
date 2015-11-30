package com.alby.dp.abstractfactory.example6.dao.impl;

public class RdbMainDAOImpl implements OrderMainDao {
    @Override
    public void saveOrderMain() {
        System.out.println("now is RdbMainDAOImpl saveOrderMain");
    }
}
