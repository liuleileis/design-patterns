package com.pattern.creational.abstractfactory.example2.db.impl;

import com.pattern.creational.abstractfactory.example2.dao.CommodityDao;
import com.pattern.creational.abstractfactory.example2.dao.UserDao;
import com.pattern.creational.abstractfactory.example2.dao.impl.CommodityOracleDao;
import com.pattern.creational.abstractfactory.example2.dao.impl.UserOracleDao;
import com.pattern.creational.abstractfactory.example2.db.DataBaseFactory;

public class OracleFactory implements DataBaseFactory {

    @Override
    public UserDao getUserDao() {
        return new UserOracleDao();
    }

    @Override
    public CommodityDao getCommodityDao() {
        return new CommodityOracleDao();
    }

}
