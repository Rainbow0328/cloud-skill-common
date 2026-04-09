package com.cloudskill.common.domain.dto.graph;

import lombok.Data;

/**
 * Graph更新DTO
 */
@Data
public class GraphUpdateDTO {

    /**
     * Graph名称
     */
    private String name;

    /**
     * Graph描述
     */
    private String description;

    /**
     * 分类
     */
    private String category;

    /**
     * 负责人
     */
    private String owner;

    /**
     * 标签列表
     */
    private String tags;

    /**
     * 状态
     */
    private String status;

    /**
     * 是否公开
     */
    private Boolean isPublic;
}
