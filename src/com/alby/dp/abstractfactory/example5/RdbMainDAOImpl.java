package com.alby.dp.abstractfactory.example5;

public class RdbMainDAOImpl implements OrderMainDao {
    @Override
    public void saveOrderMain() {
        System.out.println("now is RdbMainDAOImpl saveOrderMain");
    }
}
