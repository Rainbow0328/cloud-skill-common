package com.cloudskill.common.domain.dto.llm;

import lombok.Data;

/**
 * LLM生成Graph请求
 */
@Data
public class GenerateGraphRequest {
    /**
     * 用户需求描述
     */
    private String userRequirement;

    /**
     * 生成的Graph名称
     */
    private String graphName;

    /**
     * 是否公开
     */
    private Boolean isPublic;

    /**
     * 向量检索TopK
     */
    private Integer topK;
}
