package com.aim.springbbotssm.service.impl;

import com.aim.springbbotssm.dao.UserDao;
import com.aim.springbbotssm.entity.User;
import com.aim.springbbotssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String userName, String userPassword) {
        return userDao.login(userName, userPassword);
    }
}
