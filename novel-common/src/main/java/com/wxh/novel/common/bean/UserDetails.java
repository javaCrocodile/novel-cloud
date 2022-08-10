package com.wxh.novel.common.bean;

import lombok.Data;

/**
 * 登录用户信息封装
 * @author:wxh
 * @date:2022/8/10
 **/
@Data
public class UserDetails {

    private Long id;

    private String username;

    private String nickName;
}
