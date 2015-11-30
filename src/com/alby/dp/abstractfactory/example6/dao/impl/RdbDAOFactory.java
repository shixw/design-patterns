package com.alby.dp.abstractfactory.example6.dao.impl;

import com.alby.dp.abstractfactory.example6.dao.dao.DAOFactory;

public class RdbDAOFactory implements DAOFactory {
    @Override
    public OrderMainDao createOrderMainDAO() {
        return new RdbMainDAOImpl();
    }

    @Override
    public OrderDetailDao createOrderDetailDAO() {
        return new RdbDetailDAOImpl();
    }
}
