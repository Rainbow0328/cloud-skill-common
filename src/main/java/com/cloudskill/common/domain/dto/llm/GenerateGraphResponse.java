package com.cloudskill.common.domain.dto.llm;

import com.cloudskill.common.domain.def.GraphDefinition;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * LLM生成Graph响应
 */
@Data
@Builder
public class GenerateGraphResponse {
    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 生成的Graph ID
     */
    private Integer graphId;

    /**
     * 生成的Graph Key
     */
    private String graphKey;

    /**
     * 完整Graph定义
     */
    private GraphDefinition definition;

    /**
     * 缺失资源列表（可行性检查失败时）
     */
    private List<String> missingResources;

    /**
     * 使用的token数量
     */
    private Integer tokensUsed;
}
