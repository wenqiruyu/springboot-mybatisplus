package com.wen.entity;

import lombok.Data;

/**
 * @author yingxing
 * @description 用户实体类
 * @date 2019/8/27
 */
@Data
public class User {

    private Integer id;

    private String username;

    private String password;

    private String email;

    private Integer enabled;
}
