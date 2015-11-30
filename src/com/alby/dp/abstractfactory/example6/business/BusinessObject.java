package com.alby.dp.abstractfactory.example6.business;

import com.alby.dp.abstractfactory.example6.dao.MyDaoFactory;
import com.alby.dp.abstractfactory.example6.dao.dao.DAOFactory;
import com.alby.dp.abstractfactory.example6.dao.impl.OrderDetailDao;
import com.alby.dp.abstractfactory.example6.dao.impl.OrderMainDao;

public class BusinessObject {
    public static void main(String[] args) {
        DAOFactory dao = MyDaoFactory.createDaoFactory(1);

        OrderDetailDao detailDao = dao.createOrderDetailDAO();
        OrderMainDao mainDao = dao.createOrderMainDAO();

        mainDao.saveOrderMain();
        detailDao.saveOrderMain();
    }
}
