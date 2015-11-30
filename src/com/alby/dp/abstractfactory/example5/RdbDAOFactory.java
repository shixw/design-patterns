package com.alby.dp.abstractfactory.example5;

public class RdbDAOFactory extends  DAOFactory{
    @Override
    public OrderMainDao createOrderMainDAO() {
        return new RdbMainDAOImpl();
    }

    @Override
    public OrderDetailDao createOrderDetailDAO() {
        return new RdbDetailDAOImpl();
    }
}
