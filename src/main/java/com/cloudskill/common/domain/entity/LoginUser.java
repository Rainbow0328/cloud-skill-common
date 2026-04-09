package com.cloudskill.common.domain.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

/**
 * 登录用户信息
 * 用于接口获取当前用户信息，权限校验
 */
@Data
public class LoginUser {
    /**
     * 用户ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long userId;

    /**
     * 用户名
     */
    private String username;
}
