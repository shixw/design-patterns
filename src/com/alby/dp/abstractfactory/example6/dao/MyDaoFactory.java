package com.alby.dp.abstractfactory.example6.dao;

import com.alby.dp.abstractfactory.example6.dao.dao.DAOFactory;
import com.alby.dp.abstractfactory.example6.dao.impl.RdbDAOFactory;
import com.alby.dp.abstractfactory.example6.dao.impl.XmlDAOFactory;

public class MyDaoFactory {
    public static DAOFactory createDaoFactory(int type){
        DAOFactory factory = null;
        if (type == 1){
            factory = new RdbDAOFactory();
        }else if (type == 2){
            factory = new XmlDAOFactory();
        }
        return factory;
    }
}
