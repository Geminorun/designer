package com.sunbox.service.impl;

import com.sunbox.dao.UserDao;
import com.sunbox.service.UserService;

/**
 * @Auther: lyl
 * @Date: 2024/3/4 14:23
 * @Description:
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("userServiceImpl ...");
        userDao.add();
    }
}
