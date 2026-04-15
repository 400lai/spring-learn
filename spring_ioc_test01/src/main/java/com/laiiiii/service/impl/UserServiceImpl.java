package com.laiiiii.service.impl;

import com.laiiiii.dao.UserDao;
import com.laiiiii.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        System.out.println("BeanFactory调用该方法 获得UserDao设置到此处："+ userDao);
        this.userDao = userDao;
    }

}
