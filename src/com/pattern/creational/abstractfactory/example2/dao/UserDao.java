package com.pattern.creational.abstractfactory.example2.dao;

import com.pattern.creational.abstractfactory.example2.bean.User;

public interface UserDao {

    void addUser(User user);

    void deleteUser(String name);

    void updateUser(User user);

    User selectUser(String name);

}
