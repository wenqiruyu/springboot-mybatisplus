package com.wen.controller;

import com.wen.entity.User;
import com.wen.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yingxing
 * @description
 * @date 2019/8/27
 */
@RestController
@RequestMapping("user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @GetMapping("/get")
    public String getUser(Integer id){

        logger.info("this is getUser: ", id);
        User userById = userService.getUserById(id);
        logger.info("getUser result {}", userById);
        return "";
    }
}
