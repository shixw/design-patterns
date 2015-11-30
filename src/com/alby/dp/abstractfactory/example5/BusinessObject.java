package com.alby.dp.abstractfactory.example5;

public class BusinessObject {
    public static void main(String[] args) {
        DAOFactory dao = new RdbDAOFactory();

        OrderDetailDao detailDao = dao.createOrderDetailDAO();
        OrderMainDao mainDao = dao.createOrderMainDAO();

        mainDao.saveOrderMain();
        detailDao.saveOrderMain();
    }
}
