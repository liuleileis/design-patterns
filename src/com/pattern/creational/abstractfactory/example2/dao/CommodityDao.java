package com.pattern.creational.abstractfactory.example2.dao;

import com.pattern.creational.abstractfactory.example2.bean.Commodity;

public interface CommodityDao {

    void addCommodity(Commodity commodity);

    void deleteCommodity(String name);

    void updateCommodity(Commodity commodity);

    Commodity selectCommodity(String name);

}
