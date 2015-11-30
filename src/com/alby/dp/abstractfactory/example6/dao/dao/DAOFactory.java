package com.alby.dp.abstractfactory.example6.dao.dao;

import com.alby.dp.abstractfactory.example6.dao.impl.OrderDetailDao;
import com.alby.dp.abstractfactory.example6.dao.impl.OrderMainDao;

public interface DAOFactory {

    public OrderMainDao createOrderMainDAO();

    public OrderDetailDao createOrderDetailDAO();
}
