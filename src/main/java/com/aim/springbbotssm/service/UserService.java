package com.aim.springbbotssm.service;


import com.aim.springbbotssm.entity.User;

public interface UserService {
    public User login(String userName, String userPassword);
}
