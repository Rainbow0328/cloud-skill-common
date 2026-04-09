package com.cloudskill.common.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.cloudskill.common.handler.JsonListMapTypeHandler;
import com.cloudskill.common.handler.JsonMapTypeHandler;
import com.cloudskill.common.handler.JsonStringListTypeHandler;
import com.cloudskill.common.handler.JsonStringMapTypeHandler;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 技能实体类
 */
@Data
@TableName("t_skill")
public class Skill {

    @TableId(type = IdType.INPUT)
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 技能名称
     */
    private String name;

    /**
     * 技能描述
     */
    private String description;

    /**
     * 技能分类
     */
    private String category;

    /**
     * 使用场景
     */
    private String usageScenarios;

    /**
     * 调用端点
     */
    private String endpoint;

    /**
     * HTTP方法
     */
    private String httpMethod;

    /**
     * 请求Schema (JSON Schema)
     */
    private String requestSchema;

    /**
     * 响应Schema (JSON Schema)
     */
    private String responseSchema;

    /**
     * 参数定义
     */
    @TableField(typeHandler = JsonListMapTypeHandler.class)
    private java.util.List<java.util.Map<String, Object>> parameters;

    /**
     * 请求头
     */
    @TableField(typeHandler = JsonStringMapTypeHandler.class)
    private java.util.Map<String, String> headers;

    /**
     * 超时时间(毫秒)
     */
    private Integer timeout;

    /**
     * 重试次数
     */
    private Integer retryCount;

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 版本号
     */
    private String version;

    /**
     * 提供者 ID
     */
    private String providerId;

    /**
     * 状态：active/unavailable/deleted
     */
    private String status;

    /**
     * 是否全量更新
     */
    private Boolean fullReload;

    /**
     * 是否公开技能
     */
    private Boolean isPublic;

    /**
     * 协议类型：HTTP/GRPC/MQ 等
     */
    private String protocol;

    /**
     * 请求内容类型
     */
    private String contentType;

    /**
     * 扩展元数据
     */
    @TableField(typeHandler = JsonMapTypeHandler.class)
    private java.util.Map<String, Object> metadata;

    /**
     * 是否需要额外身份验证
     */
    private Boolean requireAuth;

    /**
     * 技能级限流 QPS，NULL 表示不限制
     */
    private Integer rateLimit;

    /**
     * 需要的上下文参数列表
     */
    @TableField(typeHandler = JsonStringListTypeHandler.class)
    private java.util.List<String> requiredContext;

    /**
     * 参数映射规则
     */
    @TableField(typeHandler = JsonStringMapTypeHandler.class)
    private java.util.Map<String, String> parameterMapping;

    /**
     * 错误处理策略
     */
    private String errorHandlingStrategy;

    /**
     * 技能来源：swagger/springmvc/manual 等
     */
    private String source;

    /**
     * 技能来源路径（如 URL 路径、类名。方法名等）
     */
    private String sourcePath;

    /**
     * 注册类型：0=正常注册(NORMAL)，1=预注册(PRE_REGISTER)
     */
    private Integer registrationType;

    /**
     * 预注册时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime preRegisteredAt;

    /**
     * 预注册批次号
     */
    private String preRegisterBatchNo;

    /**
     * 技能来源：swagger/springmvc/manual 等
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 更新人
     */
    private String updatedBy;

    /**
     * 是否删除
     */
    @TableLogic
    private Boolean isDeleted;

    /**
     * 是否为平台系统Skill
     * true=平台内置系统Skill，false=用户自定义Skill
     */
    private Boolean isSystem = false;
}
