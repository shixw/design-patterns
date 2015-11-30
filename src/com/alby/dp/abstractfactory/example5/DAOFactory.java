package com.alby.dp.abstractfactory.example5;

/**
 * Created by xianwei on 2015/11/30.
 */
public abstract class DAOFactory {

    public abstract OrderMainDao createOrderMainDAO();

    public abstract OrderDetailDao createOrderDetailDAO();
}
