package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    /**
     * 微信登录
     * @param  userLoginVO
     * @return com.sky.entity.User
     * @author LanL
     * @date 2023/11/3 22:53
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
