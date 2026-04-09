package com.cloudskill.common.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.util.Map;

/**
 * 服务注册请求DTO
 */
@Data
public class ServiceRegisterDTO {

    /**
     * 服务名称
     */
    @NotBlank(message = "服务名称不能为空")
    private String serviceName;

    /**
     * 实例ID
     */
    @NotBlank(message = "实例ID不能为空")
    private String instanceId;

    /**
     * IP地址
     */
    @NotBlank(message = "IP地址不能为空")
    private String ipAddress;

    /**
     * 端口号
     */
    @NotNull(message = "端口号不能为空")
    private Integer port;

    /**
     * 服务版本
     */
    private String version = "1.0.0";

    /**
     * 元数据
     */
    private Map<String, Object> metadata;
}
