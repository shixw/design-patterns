package com.alby.dp.abstractfactory.example5;

public class XmlDAOFactory extends  DAOFactory{
    @Override
    public OrderMainDao createOrderMainDAO() {
        return new XmlMainDAOImpl();
    }

    @Override
    public OrderDetailDao createOrderDetailDAO() {
        return new XmlDetailDAOImpl();
    }
}
