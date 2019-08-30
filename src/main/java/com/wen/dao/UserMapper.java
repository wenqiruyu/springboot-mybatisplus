package com.wen.dao;

import com.wen.entity.User;

public interface UserMapper {

    User queryUserById(Integer id);

    User queryUserByName(String name);
}
