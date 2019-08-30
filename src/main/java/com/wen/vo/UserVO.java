package com.wen.vo;

import lombok.Data;

/**
 * @author yingxing
 * @description
 * @date 2019/8/27
 */
@Data
public class UserVO {

    private String userName;

    private String password;

    private String email;

    private Integer enabled;
}
