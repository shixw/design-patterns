package com.alby.dp.abstractfactory.example6.dao.impl;

import com.alby.dp.abstractfactory.example6.dao.dao.DAOFactory;

public class XmlDAOFactory implements DAOFactory {
    @Override
    public OrderMainDao createOrderMainDAO() {
        return new XmlMainDAOImpl();
    }

    @Override
    public OrderDetailDao createOrderDetailDAO() {
        return new XmlDetailDAOImpl();
    }
}
