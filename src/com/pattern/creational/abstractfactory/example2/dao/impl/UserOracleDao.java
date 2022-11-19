package com.pattern.creational.abstractfactory.example2.dao.impl;

import com.pattern.creational.abstractfactory.example2.bean.User;
import com.pattern.creational.abstractfactory.example2.dao.UserDao;

public class UserOracleDao implements UserDao {

    @Override
    public void addUser(User user) {
        System.out.println("Oracle add " + user.toString());
    }

    @Override
    public void deleteUser(String name) {
        System.out.println("Oracle delete user " + name);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("Oracle update " + user.toString());
    }

    @Override
    public User selectUser(String name) {
        System.out.println("Oracle select user" + name);
        return new User();
    }

}
