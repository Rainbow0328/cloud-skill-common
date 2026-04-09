package com.cloudskill.common.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.cloudskill.common.handler.JsonStringListTypeHandler;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * LLM生成日志审计
 * 记录每次生成请求，统计token消耗，便于计费和限流
 */
@Data
@TableName("t_llm_generation_log")
public class LlmGenerationLog {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 请求用户ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long userId;

    /**
     * 请求用户名
     */
    private String username;

    /**
     * 用户需求
     */
    private String userRequirement;

    /**
     * 是否生成成功
     */
    private Boolean feasible;

    /**
     * 缺失的资源列表
     */
    @TableField(typeHandler = JsonStringListTypeHandler.class)
    private List<String> missingResources;

    /**
     * 重试次数
     */
    private Integer retries;

    /**
     * 生成的Graph Key
     */
    private String generatedGraphKey;

    /**
     * 状态
     */
    private String status;

    /**
     * 错误消息
     */
    private String errorMessage;

    /**
     * 使用的token数量
     */
    private Integer tokensUsed;

    /**
     * 持续时间（秒）
     */
    private Integer duration;

    /**
     * 完成时间
     */
    private Date finishedAt;

    /**
     * 生成的Graph ID（成功时有值）
     */
    private Integer generatedGraphId;

    /**
     * 返回结果消息
     */
    private String resultMessage;

    /**
     * 耗时（毫秒）
     */
    private Long costMs;

    /**
     * 创建时间
     */
    private Date createdAt;
}
