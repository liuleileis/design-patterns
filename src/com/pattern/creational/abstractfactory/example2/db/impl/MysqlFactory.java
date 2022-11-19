package com.pattern.creational.abstractfactory.example2.db.impl;

import com.pattern.creational.abstractfactory.example2.bean.Commodity;
import com.pattern.creational.abstractfactory.example2.bean.User;
import com.pattern.creational.abstractfactory.example2.dao.CommodityDao;
import com.pattern.creational.abstractfactory.example2.dao.UserDao;
import com.pattern.creational.abstractfactory.example2.dao.impl.CommodityMysqlDao;
import com.pattern.creational.abstractfactory.example2.dao.impl.UserMysqlDao;
import com.pattern.creational.abstractfactory.example2.db.DataBaseFactory;

public class MysqlFactory implements DataBaseFactory {

    @Override
    public UserDao getUserDao() {
        return new UserMysqlDao();
    }

    @Override
    public CommodityDao getCommodityDao() {
        return new CommodityMysqlDao();
    }

}
