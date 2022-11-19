package com.pattern.creational.abstractfactory.example2.dao.impl;

import com.pattern.creational.abstractfactory.example2.bean.User;
import com.pattern.creational.abstractfactory.example2.dao.UserDao;

public class UserMysqlDao implements UserDao  {

    @Override
    public void addUser(User user) {
        System.out.println("MySQL add " + user.toString());
    }

    @Override
    public void deleteUser(String name) {
        System.out.println("MySQL delete user " + name);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("MySQL update " + user.toString());
    }

    @Override
    public User selectUser(String name) {
        System.out.println("MySQL select user" + name);
        return new User();
    }

}
