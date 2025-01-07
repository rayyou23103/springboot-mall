package com.rayyou.springbootmall.service;

import com.rayyou.springbootmall.dto.UserLoginRequest;
import com.rayyou.springbootmall.dto.UserRegisterRequest;
import com.rayyou.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);

}
