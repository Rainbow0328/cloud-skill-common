package com.cloudskill.common.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.time.LocalDateTime;

/**
 * 模型配置 - 平台级资源
 * 统一管理模型API Key、BaseURL等配置
 * Graph节点通过modelKey引用，支持动态替换
 */
@Data
@TableName("t_model_config")
public class ModelConfig {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 唯一标识Key
     */
    private String modelKey;

    /**
     * 模型展示名称
     */
    private String name;

    /**
     * 模型提供商: DASHSCOPE/OPENAI/OLLAMA/ANTHROPIC/CUSTOM
     */
    private String provider;

    /**
     * 实际模型名称: qwen-max, gpt-4, etc.
     */
    private String modelName;

    /**
     * 模型描述
     */
    private String description;

    /**
     * API密钥（加密存储）
     */
    private String apiKey;

    /**
     * 自定义API Base URL
     */
    private String baseUrl;

    /**
     * 组织ID（OpenAI可用）
     */
    private String organization;

    /**
     * 默认温度
     */
    private Double defaultTemperature;

    /**
     * 默认最大Token
     */
    private Integer defaultMaxTokens;

    /**
     * 默认Top P
     */
    private Double defaultTopP;

    /**
     * 输出JSON Schema（限定输出格式，可选）
     * 用于验证模型输出符合预期格式，避免后续流程异常
     */
    private String outputSchema;

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 是否开放给LLM自动编排（0=私密，1=公开）
     */
    private Boolean isPublic;

    /**
     * 是否删除
     */
    @TableLogic
    private Boolean isDeleted;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedAt;
}
