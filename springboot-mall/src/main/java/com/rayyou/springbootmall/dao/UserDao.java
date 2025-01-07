package com.rayyou.springbootmall.dao;

import com.rayyou.springbootmall.dto.UserRegisterRequest;
import com.rayyou.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
