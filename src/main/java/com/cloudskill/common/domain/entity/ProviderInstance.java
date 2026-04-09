package com.cloudskill.common.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

/**
 * Provider 实例实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_provider_instance")
public class ProviderInstance {

    /**
     * 实例 ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * Provider ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long providerId;

    /**
     * 微服务实例 ID
     */
    private String instanceId;

    /**
     * 服务地址
     */
    private String serviceUrl;

    /**
     * 最后心跳时间
     */
    private LocalDateTime lastHeartbeatAt;

    /**
     * 状态：active/inactive
     */
    private String status;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;
}
