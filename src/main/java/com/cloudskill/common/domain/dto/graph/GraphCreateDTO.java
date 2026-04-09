package com.cloudskill.common.domain.dto.graph;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;

/**
 * Graph创建DTO
 */
@Data
public class GraphCreateDTO {

    /**
     * Graph唯一标识Key
     */
    @NotBlank(message = "Graph Key不能为空")
    private String graphKey;

    /**
     * Graph名称
     */
    @NotBlank(message = "Graph名称不能为空")
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
}
