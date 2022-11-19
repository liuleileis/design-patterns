package com.pattern.creational.abstractfactory.example2.service;

import com.pattern.creational.abstractfactory.example2.bean.Commodity;
import com.pattern.creational.abstractfactory.example2.bean.User;
import com.pattern.creational.abstractfactory.example2.db.DataBaseFactory;
import com.pattern.creational.abstractfactory.example2.db.impl.MysqlFactory;
import com.pattern.creational.abstractfactory.example2.db.impl.OracleFactory;

public class Test {

    public static void main(String[] args) {
        // Create User and Commodity
        User user = new User("张三", 20, "北京");
        Commodity commodity = new Commodity("手机", 4999, 2);

        // MySQL
        DataBaseFactory mysql = new MysqlFactory();
        mysql.getUserDao().addUser(user);
        mysql.getCommodityDao().deleteCommodity(commodity.getName());

        // Oracle
        DataBaseFactory oracle = new OracleFactory();
        oracle.getUserDao().selectUser(user.getName());
        oracle.getCommodityDao().updateCommodity(commodity);
    }

}
