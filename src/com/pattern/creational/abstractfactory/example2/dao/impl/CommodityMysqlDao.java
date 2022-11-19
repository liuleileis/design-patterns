package com.pattern.creational.abstractfactory.example2.dao.impl;

import com.pattern.creational.abstractfactory.example2.bean.Commodity;
import com.pattern.creational.abstractfactory.example2.dao.CommodityDao;

public class CommodityMysqlDao implements CommodityDao {

    @Override
    public void addCommodity(Commodity commodity) {
        System.out.println("MySQL add " + commodity.toString());
    }

    @Override
    public void deleteCommodity(String name) {
        System.out.println("MySQL delete commodity " + name);
    }

    @Override
    public void updateCommodity(Commodity commodity) {
        System.out.println("MySQL update " + commodity.toString());
    }

    @Override
    public Commodity selectCommodity(String name) {
        System.out.println("MySQL select commodity " + name);
        return new Commodity();
    }

}
