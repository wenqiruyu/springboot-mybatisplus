package com.wen.service;

import com.wen.entity.User;

public interface IUserService {

    User getUserById(Integer id);

    User getUserByName(String name);
}
