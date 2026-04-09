package com.cloudskill.common.domain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * 心跳请求DTO
 */
@Data
public class HeartbeatDTO {

    /**
     * 实例ID
     */
    @NotBlank(message = "实例ID不能为空")
    private String instanceId;

    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 服务版本
     */
    private String serviceVersion;

    /**
     * 服务 IP 地址
     */
    private String serviceIp;

    /**
     * 服务端口
     */
    private Integer servicePort;

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 心跳间隔（毫秒）
     */
    private Integer heartbeatInterval;
}
