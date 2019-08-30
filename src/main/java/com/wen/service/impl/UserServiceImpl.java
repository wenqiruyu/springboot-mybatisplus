package com.wen.service.impl;

import com.wen.dao.UserMapper;
import com.wen.entity.User;
import com.wen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {

        User user = userMapper.queryUserById(id);
        return user;
    }

    @Override
    public User getUserByName(String name) {
        return null;
    }
}
