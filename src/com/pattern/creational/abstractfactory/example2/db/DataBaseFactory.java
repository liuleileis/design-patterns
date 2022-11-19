package com.pattern.creational.abstractfactory.example2.db;

import com.pattern.creational.abstractfactory.example2.bean.Commodity;
import com.pattern.creational.abstractfactory.example2.bean.User;
import com.pattern.creational.abstractfactory.example2.dao.CommodityDao;
import com.pattern.creational.abstractfactory.example2.dao.UserDao;

public interface DataBaseFactory {

    UserDao getUserDao();

    CommodityDao getCommodityDao();

}
