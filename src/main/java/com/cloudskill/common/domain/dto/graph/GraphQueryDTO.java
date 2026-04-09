package com.cloudskill.common.domain.dto.graph;

import lombok.Data;

/**
 * Graph查询DTO
 */
@Data
public class GraphQueryDTO {

    /**
     * 关键词（名称/Key/描述）
     */
    private String keyword;

    /**
     * 分类
     */
    private String category;

    /**
     * 状态
     */
    private String status;

    /**
     * 是否公开
     */
    private Boolean isPublic;
}
