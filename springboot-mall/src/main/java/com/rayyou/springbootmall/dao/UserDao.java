package com.rayyou.springbootmall.dao;

import com.rayyou.springbootmall.dto.UserRegisterRequest;
import com.rayyou.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
