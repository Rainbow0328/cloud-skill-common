package com.cloudskill.common.domain.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.util.Map;

/**
 * 技能调用请求DTO
 */
@Data
public class SkillCallRequestDTO {

    /**
     * 技能ID
     */
    @NotNull(message = "技能ID不能为空")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long skillId;

    /**
     * 调用参数
     */
    private Map<String, Object> parameters;

    /**
     * 请求头
     */
    private Map<String, String> headers;

    /**
     * 超时时间（毫秒）
     */
    private Integer timeout;

    /**
     * 是否异步调用
     */
    private Boolean async = false;

    /**
     * 上下文参数
     */
    private Map<String, Object> context;

    /**
     * 是否跳过缓存
     */
    private Boolean skipCache = false;

    /**
     * 降级返回值
     */
    private String fallbackValue;
}
