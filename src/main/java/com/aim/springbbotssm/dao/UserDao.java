package com.aim.springbbotssm.dao;

import com.aim.springbbotssm.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao {
    public User login(@Param("userName")String userName, @Param("userPassword")String userPassword);
}
