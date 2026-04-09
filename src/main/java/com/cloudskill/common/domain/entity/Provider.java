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
 * Provider 实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_provider")
public class Provider {

    /**
     * Provider ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * Provider 名称
     */
    private String name;

    /**
     * 状态：active/pre-online/offline
     */
    private String status;

    /**
     * 软删除时间
     */
    private LocalDateTime deletedAt;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;
}
