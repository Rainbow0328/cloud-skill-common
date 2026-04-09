package com.cloudskill.common.domain.dto.graph;

import lombok.Data;
import java.util.List;

/**
 * Graph验证结果DTO
 */
@Data
public class GraphValidateResultDTO {

    /**
     * 是否验证通过
     */
    private Boolean success;

    /**
     * 错误信息列表
     */
    private List<String> errors;

    /**
     * 依赖数量
     */
    private Integer dependencyCount;

    /**
     * 节点数量
     */
    private Integer nodeCount;

    /**
     * 边数量
     */
    private Integer edgeCount;

    /**
     * 警告信息列表
     */
    private List<String> warnings;
}
